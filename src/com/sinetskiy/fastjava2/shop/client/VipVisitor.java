package com.sinetskiy.fastjava2.shop.client;

public class VipVisitor extends BaseVisitor{

    private float discount;

    @Override
    public void buy(){
        if(!checkDiscount()) {
            super.buy();
        } else {
            // купить со скидкой
        }
    }

    private boolean checkDiscount() {
        return discount>0;
    }

}
