package com.sinetskiy.fastjava2.shop.client;

import com.sinetskiy.fastjava2.shop.interfaces.GoodsInterface;

public class VipVisitor extends AbstractVisitor {

    private float discount;

    public VipVisitor(String name, float discount) {
        super(name);
        this.discount = discount;
    }

    @Override
    public void buy(GoodsInterface good){
        if(!checkDiscount()) {
            super.buy(good);
        } else {
            // купить со скидкой
        }
    }

    private boolean checkDiscount() {
        return discount>0;
    }

}
