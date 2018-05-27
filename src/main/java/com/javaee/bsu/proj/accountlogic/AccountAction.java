package com.javaee.bsu.proj.accountlogic;

public interface AccountAction {
    boolean openAccount();
    boolean closeAccount();
    void blocking();
    void unBlocking();
    double depositInCsh(int accountNumber, int amount);
    boolean withdraw(int accountNumber, int amount);
    boolean convert(double amount);
    boolean transfer(double amount);
}
