package com.learn.spring5.demo.ioc.example;

public class CyclicDependencyA {
    protected CyclicDependencyB cyclicDependencyB;

    public CyclicDependencyA(CyclicDependencyB cyclicDependencyB) {
        this.cyclicDependencyB = cyclicDependencyB;
    }
}
