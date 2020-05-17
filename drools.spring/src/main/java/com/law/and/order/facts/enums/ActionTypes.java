package com.law.and.order.facts.enums;

public enum ActionTypes {
	LISENJE_ZIVOTA("Lisenje zivota"),
	SVIREPO_IZVRSAVANJE("Svirepo izvrsavanje"),
	UBISTVO_DETA("Ubistvo deta"),
	UBISTVO_TRUDNE_ZENE("Ubistvo trudne zene"),
	UBISTVO_SLUZBENOG_LICA_PRI_VRSENJU_DUZNOSTI("Ubistvo sluzbenog lica pri vrsenju duznosti"),
	UBISTVO_ZLOSTAVLJANOG_CLANA_PORODICE("Ubistvo zlostavljanog clana porodice"),
	DOVEDEN_U_STANJE_RADRAZENOSTI("Doveden u stanje radrazenosti"),
	MAJKA_ZRTVE("Majka zrtve"),
	ZA_VREME_ILI_NEPOSREDNO_NAKON_PORODJAJA("Za vreme ili neposredno nakon porodjaja"),
	BEZ_NAMERE("Bez namere"),
	NEPROPISNO_IZVRSAVANJE_PREKIDA_TRUDONOCE("Nepropisno izvrsavanje prekida trudonoce"),
	TELESNA_POVREDA("Telesna povreda"),
	TESKO_ZDRAVSTVENO_STANJE_ZRTVE("Tesko zdravstveno stanje zrtve"),
	UCESTVOVAO_U_TUCU("Ucestvovao u tucu"),
	PRISUTSVO_OPASNOG_ORUDJA("Prisutsvo opasnog orudja")
	
//---------------------- Dela protiv imovine --------------------------
	
	
	;

	private String value;
	ActionTypes(String string) {
		value = string;
	}
	
	public String getValue() {
		return this.value;
	}
	
	
	
}
