package com.sinetskiy.fastjava2.shop.goods;

public class Computer extends ElectronicDevice{

    private int ram;

    public Computer(String name) {
        super(name);
    }

    public Computer(double price, boolean hasGuarantee, String name, String company, int ram) {
        super(price, hasGuarantee, name, company);
        this.ram = ram;
    }

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
