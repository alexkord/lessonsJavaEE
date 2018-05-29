package com.javaee.bsu.proj.accountlogic;

public interface AccountOperationManager {
    double depositInCash(int accountNumber, int amount);
    boolean withdraw();

}
