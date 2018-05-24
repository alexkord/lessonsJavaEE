package com.spring.bean_factory;

public class BookwormOracle implements Oracle {
    @Override
    public String defineMeaningOfLife() {
        return "Encyclopedias are a waste of money - use the Internet";
    }

    @Override
    public String toString() {
        return "BookwormOracle{}";
    }
}
