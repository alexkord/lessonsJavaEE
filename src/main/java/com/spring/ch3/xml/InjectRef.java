package com.spring.ch3.xml;

import com.spring.bean_factory.Oracle;

public class InjectRef {
    private Oracle oracle;

    public void setOracle(Oracle oracle) {
        this.oracle = oracle;
    }

    @Override
    public String toString() {
        return oracle.defineMeaningOfLife();
    }
}
