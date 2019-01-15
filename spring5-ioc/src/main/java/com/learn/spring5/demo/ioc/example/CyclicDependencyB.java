package com.learn.spring5.demo.ioc.example;

public class CyclicDependencyB {
    private CyclicDependencyA cyclicDependencyA;

    public CyclicDependencyB(CyclicDependencyA cyclicDependencyA) {
        this.cyclicDependencyA = cyclicDependencyA;
    }
}
