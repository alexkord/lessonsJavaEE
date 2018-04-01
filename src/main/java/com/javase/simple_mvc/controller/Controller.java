package com.javase.simple_mvc.controller;

import com.javase.simple_mvc.model.Person;
import com.javase.simple_mvc.view.View;

public class Controller {
    private Person person;
    private View view;

    public void create() {
        person = Person.builder()
                .firstName("Oleg")
                .lastName("Cherednichenko")
                .build();

        showPerson();
    }

    private void showPerson() {
        view.show(person);
    }
}
