package com.sinetskiy.fastjava2.shop.bank;

public class VTB extends BaseBank {

    public VTB(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    protected String getInfo() {
        return "VTB";
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
