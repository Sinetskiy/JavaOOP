package com.sinetskiy.fastjava2.shop.bank;

import com.sinetskiy.fastjava2.shop.interfaces.BankInterface;

public class BaseBank implements BankInterface{

    private String name;
    private String creditDescription;

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
