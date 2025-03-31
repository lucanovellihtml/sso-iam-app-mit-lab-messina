package com.dxc.mit.iam.configuration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/*
 * Classe di configurazione dell'oggetto RestTemplate.
 * L'oggetto RestTemplate permette di effettuare chiamate HTTP in Spring.
 */
@Configuration
public class RestTemplateConfig {

    /*
     * Questo bean crea un'istanza di HttpComponentsClientHttpRequestFactory, una
     * classe di Spring che utilizza internamente Apache HttpClient per gestire le
     * richieste HTTP.
     * Questa factory offre funzionalità avanzate rispetto alla
     * factory predefinita di RestTemplate, come il supporto per il pooling delle
     * connessioni e una gestione più efficiente delle risorse.
     */
    @Bean
    public HttpComponentsClientHttpRequestFactory httpComponentsClientHttpRequestFactory() {
        return new HttpComponentsClientHttpRequestFactory();
    }

    /*
     * Questo bean crea e configura un'istanza di RestTemplate, utilizzando
     * RestTemplateBuilder per una configurazione più fluida e leggibile.
     * RestTemplate è una classe di Spring che semplifica l'interazione con servizi
     * RESTful, gestendo automaticamente la serializzazione e deserializzazione
     * degli oggetti Java in JSON e viceversa.
     */
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
