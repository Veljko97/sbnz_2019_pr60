package com.law.and.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import com.law.and.order.facts.CrimeClasification;
import com.law.and.order.facts.enums.ActionTypes;

@RestController
public class LawAndOrderController {
	private static Logger log = LoggerFactory.getLogger(LawAndOrderController.class);

	private final LawAndOrderService lawAndOrderService;

	@Autowired
	    public LawAndOrderController(LawAndOrderService sampleService) {
	        this.lawAndOrderService = sampleService;
	    }

	@RequestMapping(value = "/actions", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getQuestions(@RequestParam(required = false) ActionTypes[] actionTypes) {
		
		if(actionTypes == null || actionTypes.length == 0) {
			return ResponseEntity.badRequest().build();
		}
		
		CrimeClasification crimeClasification = lawAndOrderService.getClassifiedItem(actionTypes);
		return ResponseEntity.ok(crimeClasification);
	}
	
}
