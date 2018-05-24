package com.javaee.bsu.inner;

import java.util.Random;

public class Abonent {
    private long id;
    private String name;
    private String tariffPlan;
    private PhoneNumber phoneNumber;

    public Abonent(long id, String name) {
        this.id = id;
        this.name = name;
    }

    private class PhoneNumber {
        private int countryCode;
        private int netCode;
        private int number;

        public void setCountryCode(int countryCode) {
            this.countryCode = countryCode;
        }

        public void setNetCode(int netCode) {
            this.netCode = netCode;
        }

        public int generateNumber() {
            number = new Random().nextInt(10_000_000);
            return number;
        }
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTariffPlan() {
        return tariffPlan;
    }

    public void setTariffPlan(String tariffPlan) {
        this.tariffPlan = tariffPlan;
    }

    public String getPhoneNumber() {
        if (phoneNumber != null) {
            return ("+" + phoneNumber.countryCode + "-" + phoneNumber.netCode + "-" + phoneNumber.number);
        } else {
            return ("phone number is empty");
        }
    }

    public void obtainPhoneNumber(int countryCode, int netCode) {
        phoneNumber = new PhoneNumber();
        phoneNumber.setCountryCode(countryCode);
        phoneNumber.setNetCode(netCode);
        phoneNumber.generateNumber();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("Abonent " +  name + " :\n");
        sb.append("     ID - " + id + "\n");
        sb.append("     Tariff Plan - " + tariffPlan + "\n");
        sb.append("     Phone Number - " + getPhoneNumber() + "\n");
        return sb.toString();
    }
}
