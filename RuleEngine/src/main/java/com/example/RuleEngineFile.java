package com.example;

import java.util.HashMap;
import java.util.Map;

public class RuleEngineFile {
    public static void main(String[] args) {
        Parser parser = new Parser();
        Evaluator evaluator = new Evaluator();
        Storage storage = new Storage();


        String rule1 = "((age > 30 AND department = 'Sales') OR (age < 25 AND department = 'Marketing')) AND (salary > 50000 OR experience > 5)";
        String rule2 = "((age > 30 AND department = 'Marketing')) AND (salary > 20000 OR experience > 5)";


        Node ast1 = parser.createRule(rule1);
        Node ast2 = parser.createRule(rule2);
        storage.saveRule("rule1", ast1);
        storage.saveRule("rule2", ast2);

        Node combinedAST = parser.combineRules(new String[]{rule1, rule2});
        storage.saveRule("combined", combinedAST);

        Map<String, Object> data = new HashMap<>();
        data.put("age", 35);
        data.put("department", "Sales");
        data.put("salary", 60000);
        data.put("experience", 3);

        boolean result = evaluator.evaluateRule(storage.getRule("combined"), data);
        System.out.println("Eligibility: " + result);
    }
}
