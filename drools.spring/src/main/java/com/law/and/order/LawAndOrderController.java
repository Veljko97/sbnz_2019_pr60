package com.law.and.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import com.law.and.order.facts.CrimeClasification;
import com.law.and.order.facts.enums.ActionTypesDelaProtivImovine;
import com.law.and.order.facts.enums.ActionTypes;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

@RestController
public class LawAndOrderController {
	private static Logger log = LoggerFactory.getLogger(LawAndOrderController.class);

	private final LawAndOrderService lawAndOrderService;

	@Autowired
	    public LawAndOrderController(LawAndOrderService sampleService) {
	        this.lawAndOrderService = sampleService;
	    }

	@RequestMapping(value = "/actions", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getCrime(@RequestParam(required = false) ActionTypes[] actionTypes) {
		
		if(actionTypes == null || actionTypes.length == 0) {
			return ResponseEntity.badRequest().build();
		}
		
		CrimeClasification crimeClasification = lawAndOrderService.getCrime(actionTypes);
		return ResponseEntity.ok(crimeClasification);
	}

	@RequestMapping(value = "/getRules", method = RequestMethod.GET)
	public ResponseEntity<?> getRules(@RequestParam(required = true) String ruleSet) throws FileNotFoundException {
		File file = ResourceUtils.getFile("classpath:drools/rules/" + ruleSet + ".drl");

		BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));
		String text = "";
		Scanner scanner = new Scanner(file);
		while (scanner.hasNext()){
			text += scanner.nextLine() + '\n';
		}
		return  ResponseEntity.ok(text);
	}
}
