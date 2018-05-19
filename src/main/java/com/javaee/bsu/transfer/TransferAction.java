package com.javaee.bsu.transfer;

import com.javaee.bsu.transfer.bean.Account;

public class TransferAction {
    private static double transactionAmount;

    public TransferAction(double amount) {
        if (amount > 0) {
            this.transactionAmount = amount;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static boolean transferIntoAccount(Account from, Account to) {
        double demand = from.getAmount() - transactionAmount;
        if (demand >= 0) {
            from.setAmount(demand);
            to.addAmount(transactionAmount);
            return true;
        } else {
            return false;
        }
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }
}
