package com.law.and.order.facts.enums;

public enum ActionTypesDelaProtivImovine {
	
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
	ActionTypesDelaProtivImovine(String string) {
		value = string;
	}
	
	public String getValue() {
		return this.value;
	}
	
	
	
}
