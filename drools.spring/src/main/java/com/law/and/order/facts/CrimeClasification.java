package com.law.and.order.facts;

import com.law.and.order.facts.enums.CrimeTypes;

public class CrimeClasification {
	
	private CrimeTypes crimeType;

	public CrimeClasification() {
		super();
	}
	
	public CrimeClasification(CrimeTypes crimeType) {
		super();
		this.crimeType = crimeType;
	}

	public CrimeTypes getCrimeType() {
		return crimeType;
	}

	public void setCrimeType(CrimeTypes crimeType) {
		this.crimeType = crimeType;
	}
	
	

}
