package com.sinetskiy.fastjava2.shop.goods;

import com.sinetskiy.fastjava2.shop.interfaces.ElectronicDeviceInterface;

public class ElectronicDevice extends AbstractGoods implements ElectronicDeviceInterface {

    public ElectronicDevice() {
    }

    public ElectronicDevice(String name) {
        super(name);
    }

    public void on(){
        // общая реализация
    }

    public void off(){
        // общая реализация
    }

}
