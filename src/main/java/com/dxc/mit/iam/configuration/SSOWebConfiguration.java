package com.dxc.mit.iam.configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.CssLinkResourceTransformer;
import org.springframework.web.servlet.resource.ResourceResolver;
import org.springframework.web.servlet.resource.ResourceTransformer;
import org.springframework.web.servlet.resource.VersionResourceResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Questa classe è una configurazione Spring che personalizza il comportamento
 * di Spring MVC e del server web incorporato.
 * Si occupa di configurare FreeMarker per la generazione di viste, la gestione delle risorse statiche,
 * la configurazione di ObjectMapper per la serializzazione JSON e
 * l'abilitazione del servlet predefinito.
 */
@Configuration
public class SSOWebConfiguration implements WebMvcConfigurer {

    @Autowired
    SSOConfiguration ssoConfiguration;

    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer() {
        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
        freeMarkerConfigurer.setTemplateLoaderPath("classpath:/templates");
        freeMarkerConfigurer.setDefaultEncoding("UTF-8");
        Properties p = new Properties();
        p.setProperty("output_format", "HTML");
        freeMarkerConfigurer.setFreemarkerSettings(p);
        Map<String, Object> sharedVariables = new HashMap<>();
        sharedVariables.put("cdnUrl", this.ssoConfiguration.getStaticResourceUrl());
        freeMarkerConfigurer.setFreemarkerVariables(sharedVariables);
        return freeMarkerConfigurer;
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler(new String[] { "/**/*.js", "/**/*.css", "/**/*.map", "/**/*.png", "/**/*.svg",
                        "/**/*.webp", "/**/*.eot", "/**/*.ttf", "/**/*.woff", "/**/*.woff2" })
                .addResourceLocations(new String[] { "classpath:/static/" })
                .setCacheControl(CacheControl.maxAge(365L, TimeUnit.DAYS))
                .resourceChain(true)
                .addResolver((ResourceResolver) (new VersionResourceResolver())
                        .addContentVersionStrategy(new String[] { "/**" }))
                .addTransformer((ResourceTransformer) new CssLinkResourceTransformer());
    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        objectMapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_EMPTY);
        return objectMapper;
    }

    @Bean
    public FreeMarkerViewResolver freemarkerViewResolver() {
        FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
        resolver.setCache(true);
        resolver.setPrefix("");
        resolver.setSuffix(".ftl");
        return resolver;
    }

    @Bean
    WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> enableDefaultServlet() {
        return factory -> factory.setRegisterDefaultServlet(true);
    }

}
