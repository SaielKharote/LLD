package org.saiel.DesignPatterns.Creational.Prototype;

import java.util.HashMap;

public class IntelligentStudentRegistry {
    HashMap<String, IntelligentStudent> intelligentStudentRegistry;

    public IntelligentStudentRegistry() {
        this.intelligentStudentRegistry = new HashMap<>();
    }

    public IntelligentStudent get(String batchName) {
        return intelligentStudentRegistry.get(batchName);
    }

    public void save(IntelligentStudent intelligentStudent) {
        intelligentStudentRegistry.put(intelligentStudent.getBatchName(), intelligentStudent);
    }
}
