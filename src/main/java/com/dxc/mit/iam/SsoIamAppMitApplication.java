package com.dxc.mit.iam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

import com.dxc.mit.iam.configuration.FreemarkerClassPathTldsLoader;

@SpringBootApplication
public class SsoIamAppMitApplication {

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
