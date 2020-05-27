package com.law.and.order.facts;

import com.law.and.order.facts.enums.ActionTypes;

public class Action {
	
	private String type;
	private String description;
	
	public Action() {
	}
	
	
	
	public Action(String type) {
		super();
		this.type = type;
	}



	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
