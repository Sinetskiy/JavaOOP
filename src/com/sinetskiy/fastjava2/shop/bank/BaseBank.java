package com.sinetskiy.fastjava2.shop.bank;

import com.sinetskiy.fastjava2.shop.interfaces.BankInterface;

public abstract class BaseBank implements BankInterface{

    public BaseBank(String name, String creditDescription) {
        this.name = name;
        this.creditDescription = creditDescription;
    }

    private String name;
    private String creditDescription;

    protected abstract String getInfo();

    @Override
    public void checkInfo(){
        // стандартная реализация
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
