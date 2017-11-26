package com.sinetskiy.fastjava2.shop.client;

import com.sinetskiy.fastjava2.shop.goods.Televisor;
import com.sinetskiy.fastjava2.shop.interfaces.GoodsInterface;
import com.sinetskiy.fastjava2.shop.interfaces.VisitorInterface;

public abstract class AbstractVisitor implements VisitorInterface{

    private String name;

    public AbstractVisitor(String name) {
        this.name = name;
    }

    @Override
    public void buy(GoodsInterface goods){
        System.out.println("buy "+goods.getName());
    }

    @Override
    public void returnGoods(GoodsInterface goods) {

    }

    @Override
    public String getName() {
        return name;
    }
}
