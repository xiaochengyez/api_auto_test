package model;

import java.util.Map;

public class ApiObjectModel {
    private Map<String, ApiObjectModelMethod> methods;

    public Map<String, ApiObjectModelMethod> getMethods() {
        return methods;
    }

    public void setMethods(Map<String, ApiObjectModelMethod> methods) {
        this.methods = methods;
    }
}