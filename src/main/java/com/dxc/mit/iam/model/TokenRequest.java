package com.dxc.mit.iam.model;

/*
 * Classe utilizzata per rappresentare una richiesta che coenite il token ID.
 */
public class TokenRequest {
  private String tokenId;

  public String getTokenId() {
    return this.tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }
}