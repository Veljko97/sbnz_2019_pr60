package com.law.and.order;

import java.util.Collection;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.law.and.order.facts.Action;
import com.law.and.order.facts.CrimeClasification;
import com.law.and.order.facts.enums.ActionTypes;


@Service
public class LawAndOrderService {

	private static Logger log = LoggerFactory.getLogger(LawAndOrderService.class);

    private final KieContainer kieContainer;
   
    @Autowired
    public LawAndOrderService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }
    
    public CrimeClasification getCrime(ActionTypes[] actions) {
        KieSession kieSession = kieContainer.newKieSession("Crime");
        for(ActionTypes action : actions) {
        	kieSession.insert(new Action(action.getValue()));
        }
        kieSession.fireAllRules();
        Collection<? extends Object> objects =  kieSession.getObjects();
        kieSession.dispose();
        CrimeClasification crimeClasification = null;
        for(Object ob : objects) {
        	if(ob instanceof CrimeClasification) {
        		crimeClasification = (CrimeClasification) ob;
        	}
        }
        return crimeClasification;
    }
}
