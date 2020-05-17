package com.law.and.order.facts;

import com.law.and.order.facts.enums.ActionTypes;

public class Action {
	
	private ActionTypes type;
	private String description;
	
	public Action() {
	}
	
	
	
	public Action(ActionTypes type) {
		super();
		this.type = type;
	}



	public ActionTypes getType() {
		return type;
	}
	public void setType(ActionTypes type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
