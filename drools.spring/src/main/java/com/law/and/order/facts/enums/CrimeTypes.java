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
	UGROZAVANJE_OPASNIM_ORUDJEM_PRI_TUCI("Ugrozavanje opasnim orudjem pri tuci i svadji"),
	
	
	//---------------------- Dela protiv imovine --------------------------
	
	
	KRADJA("Kradja"),
	TESKA_KRADJA("Teska kradja"),
	RAZBOJNICKA_KRADJA("Razbojnicka kradja"),
	RAZBOJNISTVO("Razbojnistvo"),
	UTAJA("Utaja"),
	PREVARA("Prevaras"),
	UCENA("Ucena"),
	ZELENASTVO("Zelenastvo"),
	
	
	//---------------------- Dela protiv privrede --------------------------
	

	PORESKA_UTAJA("Poreska utaja"),
	PREVARA_U_OSIGURANJU("Prevara u osiguranju"),
	NEUPLACIVANJE_POREZA_PO_ODBITKU("Neuplacivanje poreza po odbitku"),
	PRIMANJE_MITA_U_OBAVLJANJU_PRIVREDNE_DELATNOSTI("Primanje mita u obavljanju privredne delatnosti"),
	DAVANJE_MITA_U_OBAVLJANJU_PRIVREDNE_DELATNOSTI("Davanje mita u obavljanju privredne delatnosti"),
	PROUZROKOVANJE_STECAJA("Prouzrokovanje stecaja"),
	KRIJUNCARENJE("Krijuncarenje"),
	NEDOZVOLJENA_TRGOVINA("Nedozvoljena trgovina"),
	NEDOZVOLJENA_PROIZVODJNA("Nedozvoljena proizvodjna"),
	;

	
	private String value;
	CrimeTypes(String string) {
		value = string;
	}
	
	public String getValue() {
		return value;
	}
	

}
