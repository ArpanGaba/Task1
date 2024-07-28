package com.example;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    private Map<String, Node> ruleStore = new HashMap<>();

    public void saveRule(String ruleName, Node rule) {
        ruleStore.put(ruleName, rule);
    }

    public Node getRule(String ruleName) {
        return ruleStore.get(ruleName);
    }
}
