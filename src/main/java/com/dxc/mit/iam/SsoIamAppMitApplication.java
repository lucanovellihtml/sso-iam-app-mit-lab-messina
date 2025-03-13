package com.dxc.mit.iam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.dxc.mit.iam.configuration.FreemarkerClassPathTldsLoader;

/**
 * il tag "exclude = {DataSourceAutoConfiguration.class}" serve per escludere la
 * configurazione automatica della sorgente dati.
 * l'estensione alla classe SpringBootServletInitializer per definire il metodo "configure" come punto di accesso dell'applicazione per il server su cui è deployata(Tomcat).
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SsoIamAppMitApplication extends SpringBootServletInitializer {

	/**
	 * Questo metodo specifica il main dell'applicazione(al server Tomcat) come punto di partenza per lo start sul tomcat.
	 */
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SsoIamAppMitApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(SsoIamAppMitApplication.class, args);
	}

	/*
	 * Questo @Bean è responsabile di caricare,solo se non esiste già
	 * l'implementazione, i Tag Library Descriptors per il motore di template
	 * Freemarker
	 */
	@Bean
	@ConditionalOnMissingBean({ FreemarkerClassPathTldsLoader.class })
	public FreemarkerClassPathTldsLoader classPathTldsLoader() {
		return new FreemarkerClassPathTldsLoader(new String[0]);
	}

}
