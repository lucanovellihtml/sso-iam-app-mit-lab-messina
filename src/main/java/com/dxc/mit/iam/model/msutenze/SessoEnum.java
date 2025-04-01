package com.dxc.mit.iam.model.msutenze;

/*
 * Classe che rappresenta i valori possibili per il sesso di una persona.
 */
public enum SessoEnum {
	UOMO("M"),
	DONNA("F");

	private String code;

	SessoEnum(String code) {
		this.code = code;
	}

	public boolean equal(String dbCode) {
		if (dbCode.equals(this.code))
			return true;
		return false;
	}

	public String getCode() {
		return this.code;
	}
}