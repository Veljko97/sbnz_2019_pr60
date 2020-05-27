package com.law.and.order.converters;

import org.springframework.core.convert.converter.Converter;

import com.law.and.order.facts.enums.ActionTypes;

public class StringToEnumConverter implements Converter<String, ActionTypes> {

	public ActionTypes convert(String source) {		
		System.out.println(source);
		 return ActionTypes.valueOf(source);
	}
		
   
}