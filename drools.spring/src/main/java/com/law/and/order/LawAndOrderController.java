package com.law.and.order;

import com.law.and.order.facts.CrimeClasification;
import com.law.and.order.facts.enums.ActionTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

@RestController
public class LawAndOrderController {

    private final LawAndOrderService lawAndOrderService;

    @Autowired
    public ResourceLoaderService resourceLoaderService;

    @Autowired
    public LawAndOrderController(LawAndOrderService sampleService) {
        this.lawAndOrderService = sampleService;
    }

    @RequestMapping(value = "/actions", method = RequestMethod.GET)
    public ResponseEntity<?> getCrime(@RequestParam(required = false) ActionTypes[] actionTypes) {

        if (actionTypes == null || actionTypes.length == 0) {
            return ResponseEntity.badRequest().build();
        }

        CrimeClasification crimeClasification = lawAndOrderService.getCrime(actionTypes);
        if (crimeClasification != null) {
            return ResponseEntity.ok(crimeClasification.toString());
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @RequestMapping(value = "/getRules", method = RequestMethod.GET)
    public ResponseEntity<?> getRules(@RequestParam(required = true) String ruleSet) throws IOException {
        Resource resource = resourceLoaderService.resourceLoader.getResource("classpath:drools/rules/" + ruleSet + ".drl");
//        File file = ResourceUtils.getFile("classpath:drools/rules/" + ruleSet + ".drl");
        File file = resource.getFile();
        String text = "";
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            text += scanner.nextLine() + '\n';
        }
        return ResponseEntity.ok(text);
    }

    @RequestMapping(value = "/saveRules", method = RequestMethod.POST)
    public ResponseEntity<?> saveRules(@RequestParam(required = true) String ruleSet, @RequestBody String rulesContent) throws IOException {
        Resource resource = resourceLoaderService.resourceLoader.getResource("classpath:drools/rules/" + ruleSet + ".drl");
        File file2 = new File("src/main/resources/drools/rules/" + ruleSet + ".drl");
//		Path path = Paths.get("classpath:drools/rules/" + ruleSet + ".drl").toAbsolutePath().normalize();
        File file = resource.getFile();
        if (!file.exists()) {
            file.createNewFile();
            file2.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(rulesContent);
        fileWriter.flush();
        fileWriter.close();

        FileWriter fileWriter2 = new FileWriter(file2);
        fileWriter2.write(rulesContent);
        fileWriter2.flush();
        fileWriter2.close();
        return ResponseEntity.ok().build();
    }
}
