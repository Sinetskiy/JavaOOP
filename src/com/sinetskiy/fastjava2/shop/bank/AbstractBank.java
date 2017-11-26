package com.sinetskiy.fastjava2.shop.bank;

import com.sinetskiy.fastjava2.shop.interfaces.BankInterface;

public abstract class AbstractBank implements BankInterface{

    // количесво заявок по всем бынкам (можно также реализовать через коллекцию)
    public static int requestCount;

    public AbstractBank(String name, String creditDescription) {
        this.name = name;
        this.creditDescription = creditDescription;
    }

    private String name;
    private String creditDescription;

    protected abstract String getInfo();

    @Override
    public void checkInfo(){
        // стандартная реализация
        requestCount++;
    }

    @Override
    public void giveCredit(){
        // стандартная реализация
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }

}
