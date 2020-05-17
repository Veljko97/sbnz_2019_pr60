package com.law.and.order.facts;

import java.util.List;

public class Crime {
	
	private String name;
	private List<Action> requiredActions;
	private List<Action> possibleActions;
	private List<Condition> applicableConditions;
	private double penalty;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Action> getRequiredActions() {
		return requiredActions;
	}
	public void setRequiredActions(List<Action> requiredActions) {
		this.requiredActions = requiredActions;
	}
	public List<Action> getPossibleActions() {
		return possibleActions;
	}
	public void setPossibleActions(List<Action> possibleActions) {
		this.possibleActions = possibleActions;
	}
	public List<Condition> getApplicableConditions() {
		return applicableConditions;
	}
	public void setApplicableConditions(List<Condition> applicableConditions) {
		this.applicableConditions = applicableConditions;
	}
	public double getPenalty() {
		return penalty;
	}
	public void setPenalty(double penalty) {
		this.penalty = penalty;
	}
	
}
