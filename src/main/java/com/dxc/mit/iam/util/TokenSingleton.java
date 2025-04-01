package com.dxc.mit.iam.util;

import org.springframework.stereotype.Component;

/*
 * Classe per la gestione del token globale.
 * Poiché è definita con un campo statico, il token è condiviso 
 * tra tutte le istanze della classe e può essere utilizzato per memorizzare un valore che deve essere globale per l'applicazione.
 */
@Component
public class TokenSingleton {
  private static String token;

  public static String getToken() {
    return token;
  }

  public static void setToken(String value) {
    token = value;
  }
}