package com.spring.dependecy_types.constructor_DI;

import com.spring.dependecy_types.contextualized_dependency_lookup.Dependency;

public class ConstructorInjection {
    private Dependency dependency;

    public ConstructorInjection(Dependency dependency) {
        this.dependency = dependency;
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}
