package com.javase.generics;

import java.util.List;

public class MethodGenerics {

    public <T> void print(T t) {

    }

    public <T extends Object> void printList(List<T> list) {}
}