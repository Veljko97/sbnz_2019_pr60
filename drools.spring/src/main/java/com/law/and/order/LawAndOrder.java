package com.law.and.order;

import java.util.Arrays;

import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class LawAndOrder {
	
	private static Logger log = LoggerFactory.getLogger(LawAndOrder.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(LawAndOrder.class, args); 
	}
	
	@Bean
    public KieContainer kieContainer() {
        return KieServices.Factory.get().getKieClasspathContainer();
    }
	/*
	 * KieServices ks = KieServices.Factory.get();
	 * KieContainer kContainer = ks.newKieContainer(ks.newReleaseId("drools-spring-v2","drools-spring-v2-kjar", "0.0.1-SNAPSHOT"));
	 * KieScanner kScanner = ks.newKieScanner(kContainer);
	 * kScanner.start(10_000);
	 * KieSession kSession = kContainer.newKieSession();
	 */
}
