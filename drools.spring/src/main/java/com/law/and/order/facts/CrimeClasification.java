package com.law.and.order.facts;

import com.law.and.order.facts.enums.CrimeTypes;

public class CrimeClasification {

    private CrimeTypes crimeType;
    private int minMonths;
    private int minYears;
	private boolean minMany;
    private int maxMonths;
    private int maxYears;
	private boolean maxMany;

    public CrimeClasification() {
        super();
    }

    public CrimeClasification(CrimeTypes crimeType) {
        this.crimeType = crimeType;
    }

	public CrimeClasification(CrimeTypes crimeType, int minMonths, int minYears, boolean minMany, int maxMonths, int maxYears, boolean maxMany) {
		this.crimeType = crimeType;
		this.minMonths = minMonths;
		this.minYears = minYears;
		this.minMany = minMany;
		this.maxMonths = maxMonths;
		this.maxYears = maxYears;
		this.maxMany = maxMany;
	}

	public void setPunishment(int minMonths, int minYears, boolean minMany, int maxMonths, int maxYears, boolean maxMany) {
		this.minMonths = minMonths;
		this.minYears = minYears;
		this.minMany = minMany;
		this.maxMonths = maxMonths;
		this.maxYears = maxYears;
		this.maxMany = maxMany;
    }

    @Override
    public String toString() {
        String zlocin = ":";
        if (minYears > 0) {
            zlocin += " " + minYears + " Godina";
        }
        if (minMonths > 0) {
            zlocin += " " + minMonths + " Meseci";
        }
        if (minMany){
        	zlocin += " Novcana Kazna";
		}
        if(!zlocin.equals(":")) {
			zlocin += " - ";
		}
        if (maxYears > 0) {
            zlocin += " " + maxYears + " Godina";
        }
        if (maxMonths > 0) {
            zlocin += " " + maxMonths + " Meseci";
        }
        if(maxYears > 100) {
        	zlocin += " Dozivotna Kazna";
		}
		if (maxMany){
			zlocin += " Novcana Kazna";
		}
		return String.format("%s sa kaznom%s", crimeType.getValue(), zlocin.equals(":") ? "" : zlocin);
    }

    public CrimeTypes getCrimeType() {
        return crimeType;
    }

    public void setCrimeType(CrimeTypes crimeType) {
        this.crimeType = crimeType;
    }

    public int getMinMonths() {
        return minMonths;
    }

    public void setMinMonths(int minMonths) {
        this.minMonths = minMonths;
    }

    public int getMinYears() {
        return minYears;
    }

    public void setMinYears(int minYears) {
        this.minYears = minYears;
    }

    public int getMaxMonths() {
        return maxMonths;
    }

    public void setMaxMonths(int maxMonths) {
        this.maxMonths = maxMonths;
    }

    public int getMaxYears() {
        return maxYears;
    }

    public void setMaxYears(int maxYears) {
        this.maxYears = maxYears;
    }
}
