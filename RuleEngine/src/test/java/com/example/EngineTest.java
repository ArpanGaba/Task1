package com.example;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class RuleEngineTest {

    @Test
    public void testCreateRule() {
        RuleParser parser = new RuleParser();
        Node ast = parser.createRule("age > 30 AND department = 'Sales'");
        assertNotNull(ast);
    }

    @Test
    public void testCombineRules() {
        Parser parser = new Parser();
        String[] rules = {"age > 30", "salary > 50000"};
        Node combinedAST = parser.combineRules(rules);
        assertNotNull(combinedAST);
    }

    @Test
    public void testEvaluateRule() {
        Parser parser = new Parser();
        Evaluator evaluator = new Evaluator();
        Storage storage = new Storage();

        String rule = "age > 30 AND salary > 50000";
        Node ast = parser.createRule(rule);
        storage.saveRule("testRule", ast);

        Map<String, Object> data = new HashMap<>();
        data.put("age", 35);
        data.put("salary", 60000);

        boolean result = evaluator.evaluateRule(storage.getRule("testRule"), data);
        assertTrue(result);
    }
}
