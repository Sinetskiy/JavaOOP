package com.sinetskiy.fastjava2.shop.goods;

public class Computer extends ElectronicDevice{

    private int ram;

    public void loadOS(){

    }

    @Override
    public void on() {
        // специфичное включение жесткого диска
    }

    @Override
    public void off() {
        // специфичное выключение жесткого диска
    }
}