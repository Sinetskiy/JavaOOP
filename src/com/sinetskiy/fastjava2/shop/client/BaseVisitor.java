package com.sinetskiy.fastjava2.shop.client;

import com.sinetskiy.fastjava2.shop.interfaces.VisitorInterface;

public class BaseVisitor implements VisitorInterface{

    private String name;

    @Override
    public void buy(){

    }

    @Override
    public void returnGoods() {

    }

    @Override
    public String getName() {
        return name;
    }
}
