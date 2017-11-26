package com.sinetskiy.fastjava2.shop.bank;

public class Sberbank extends BaseBank {

    public Sberbank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    protected String getInfo() {
        return "Sberbank";
    }

    @Override
    public void checkInfo() {
        
        //доработанная реализация
    }

    @Override
    public void giveCredit() {

        //доработанная реализация
    }
}
