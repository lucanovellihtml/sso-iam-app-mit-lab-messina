package com.dxc.mit.iam.configuration;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

/*
 * La classe e' progettata per configurare aspetti specifici del constesto web della tua applicazione.
 * Viene specificata la configurazione per il server web Tomcat e la gestione dei messaggi
 */
@Configuration
public class WebContextConfiguration {

    /*
     * questo bean è responsabile della configurazione del server web Tomcat
     * incorporato
     * in questo caso, viene creata una configurazione predefinita di Tomcat
     */
    @Bean
    public TomcatServletWebServerFactory tomcatFactory() {
        return new TomcatServletWebServerFactory();
    }

    /*
     * questo bena è responsabile della configurazione del file esterno per la
     * gestione dei messaggi localizzati
     */
    /*
     * @Bean
     * public ResourceBundleMessageSource messageSource() {
     * ResourceBundleMessageSource source = new ResourceBundleMessageSource();
     * 
     * // il classpath è -> src/main/resources
     * source.setBasename("classpath:/i18n/messages");
     * source.setCacheSeconds(0);
     * source.setDefaultEncoding("UTF-8");
     * source.setFallbackToSystemLocale(false);
     * return source;
     * }
     */

}
