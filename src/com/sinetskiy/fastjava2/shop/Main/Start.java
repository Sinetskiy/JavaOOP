package com.sinetskiy.fastjava2.shop.Main;

import com.sinetskiy.fastjava2.shop.client.CommonVisitor;
import com.sinetskiy.fastjava2.shop.goods.Computer;
import com.sinetskiy.fastjava2.shop.goods.Subwoofer;
import com.sinetskiy.fastjava2.shop.goods.Televisor;

public class Start {

    public static void main(String[] args) {
        Televisor televisor  = new Televisor("Samsung");

        Subwoofer subwoofer = new Subwoofer("Microlab");

        Computer computer = new Computer("MacBook");
        Computer computer2 = new Computer("Asus");

        CommonVisitor commonVisitor = new CommonVisitor();
        
        commonVisitor.buy(televisor);
        commonVisitor.buy(computer);
        commonVisitor.buy(computer2);
        commonVisitor.buy(subwoofer);

    }
}
