package com.spring.dependecy_types.setter_DI;

import com.spring.dependecy_types.contextualized_dependency_lookup.Dependency;

public class SetterInjection {
    private Dependency dependency;

    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}
