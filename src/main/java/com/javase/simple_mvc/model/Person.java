package com.javase.simple_mvc.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Person {
    private String firstName, lastName;
    private Account account;

    public void setAccount(Account account) {
        this.account = account;
    }
}
