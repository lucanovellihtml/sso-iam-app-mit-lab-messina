package com.dxc.mit.iam.configuration;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import freemarker.template.Configuration;

/*
 * Classe per configurare FreeMarker in modo da caricare i file TLD dal classpath.
 * Questo per l'utilizzo di taglib JSP all'interno dei template FreeMarker.
 */
public class FreemarkerClassPathTldsLoader {

    // Definizione del percorso del file TLD di Spring Security, questo file prima
    // pero' è preso dal jar spring-security-taglibs
    private static final String SECURITY_TLD = "/META-INF/security.tld";

    // Definizione del percorso del file TLD di Spring Form, questo file prima pero'
    // è preso dal jar spring-security-taglibs
    private static final String FORM_TLD = "/META-INF/spring-form.tld";

    final private List<String> classPathTlds;

    // Costruttore che inizializzza la List con dentro il paths del file TLD
    public FreemarkerClassPathTldsLoader(String... classPathTlds) {
        super();

        if (classPathTlds == null || classPathTlds.length == 0) {
            this.classPathTlds = Arrays.asList(SECURITY_TLD, FORM_TLD);
        } else {
            this.classPathTlds = Arrays.asList(classPathTlds);
        }
    }

    // Instanza per configurare FreeMarker
    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;

    /*
     * @PostConstruct indica che il seguente metodo viene eseguito dopo che
     * l'instanza della classe e le dipendenze sono state create e iniettate.
     * Il metodo imposta l'object wrapper di FreeMarker assicurando che gli oggetti
     * Java siano gestiti cotterramente nel template e con la versione specifica.
     */
    @PostConstruct
    public void loadClassPathTlds() {
        freeMarkerConfigurer.getTaglibFactory().setClasspathTlds(classPathTlds);
        freeMarkerConfigurer.getTaglibFactory()
                .setObjectWrapper(Configuration.getDefaultObjectWrapper(Configuration.VERSION_2_3_34));
    }

}