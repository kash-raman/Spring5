package com.learn.spring5.demo.ioc.example;

import org.springframework.beans.factory.annotation.Required;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TwoSample {
    int number;
    String numberValue;
    Properties properties;
    Map localMap;
    Set localSet;
    List localList;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map getLocalMap() {
        return localMap;
    }

    public void setLocalMap(Map localMap) {
        this.localMap = localMap;
    }

    public Set getLocalSet() {
        return localSet;
    }

    public void setLocalSet(Set localSet) {
        this.localSet = localSet;
    }

    public List getLocalList() {
        return localList;
    }

    public void setLocalList(List localList) {
        this.localList = localList;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNumberValue() {
        return numberValue;
    }

    @Required
    public void setNumberValue(String numberValue) {
        this.numberValue = numberValue;
    }
}
