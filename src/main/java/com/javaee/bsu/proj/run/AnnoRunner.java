package com.javaee.bsu.proj.run;

import com.javaee.bsu.proj.accountlogic.AccountOperationManager;
import com.javaee.bsu.proj.accountlogic.AccountOperationManagerImpl;
import com.javaee.bsu.proj.annotation.logic.SecurityFactory;

public class AnnoRunner {
    public static void main(String[] args) {
        AccountOperationManager account = new AccountOperationManagerImpl();
        AccountOperationManager securityAccount = SecurityFactory.createSecurityObject(account);
        securityAccount.depositInCash(10128336, 2);
        securityAccount.withdraw(64092376, 2);
        securityAccount.convert(200);
        securityAccount.transfer(64092376, 300);
    }
}

