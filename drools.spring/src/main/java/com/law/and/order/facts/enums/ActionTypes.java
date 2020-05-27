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
	PRISUTSVO_OPASNOG_ORUDJA("Prisutsvo opasnog orudja"),
	
	
	//---------------------- Dela protiv imovine --------------------------
	

	OTUDJENJE_IMOVINE("Otudjenje imovine"),
	DEO_GRUPE("Deo grupe"),
	OPASAN_I_DRZAK_NACIN("Opasan i drzak nacin"),
	ZA_VREME_ELEMENTARNIH_NEPOGODA("Za vreme elementarnih nepogoda"),
	POSEDOVANJE_ORUZIJA("Posedovanje oruzija"),
	UPOTREBA_ORUZIJA_RADI_ZADRZAVANJ_IMOVINE("Upotreba oruzija radi zadrzavanj imovine"),
	UPOTREBA_ORUZIJA_RADI_PRISVAJANJA_IMOVINE("Upotreba oruzija radi prisvajanja imovine"),
	PRISVAJANJE_TUDJE_IMOVINE("Prisvajanje tudje imovine"),
	DOVODJENJE_OSTECENOG_U_ZABLUDU_RADI_STICANJA_IMOVINE("Dovodjenje ostecenog u zabludu radi sticanja imovine"),
	PRETNJA_PO_ZIVOT_ZDRAVLJE_ILI_UGLED("Pretnja po zivot, zdravlje ili ugled"),
	PRIBAVLJANJE_IMOVINE("Pribavljanje imovine"),
	DAVANJE_NA_ZAJAM("Davanje na zajam"),
	VISOKA_KAMATA("Visoka kamata"),
	;

	private String value;
	ActionTypes(String string) {
		value = string;
	}
	
	public String getValue() {
		return this.value;
	}
	
	
	
}
