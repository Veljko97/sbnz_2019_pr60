package com.law.and.order.facts.enums;

public enum CrimeTypes {
	UBISTVO("Ubistvo"),
	TESKO_UBISTVO("Tesko Ubistvo"),
	UBISTVO_NA_MAH("Ubistvo na mah"),
	UBISTVO_DETETA_PRI_PORODJAJU("Ubistvo deteta pri porodjaju"),
	NEHATNO_LISENJE_ZIVOTA("Nehatno lisenje zivota"),
	NEDOZVOLJEN_PREKID_TRUDONOCE("Nedozvoljen prekid trudonoce"),
	LAKA_TELESNA_POVREDA("Laka telesna povreda"),
	TESKA_TELESNA_POVREDA("Teska telesna povreda"),
	UCESTVOVANJE_U_TUCI("Ucestvovanje u tuci"),
	UGROZAVANJE_OPASNIM_ORUDJEM_PRI_TUCI("Ugrozavanje opasnim orudjem pri tuci i svadji")
	;

	
	private String value;
	CrimeTypes(String string) {
		value = string;
	}
	
	public String getValue() {
		return value;
	}
	

}
