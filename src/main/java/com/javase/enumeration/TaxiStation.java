package com.javase.enumeration;

public enum TaxiStation {
    MERCEDES(10), TOYOTA(7), VOLVO;

    private int freeCabs;

    TaxiStation() {
    }

    TaxiStation(int cabs) {
        this.freeCabs = cabs;
    }

    public int getFreeCabs() {
        return freeCabs;
    }

    public void setFreeCabs(int freeCabs) {
        this.freeCabs = freeCabs;
    }


    @Override
    public String toString() {
        return String.format("%s : free cabs = %d" , name(), freeCabs);
    }
}
