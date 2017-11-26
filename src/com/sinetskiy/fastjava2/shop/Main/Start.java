package com.sinetskiy.fastjava2.shop.Main;

import com.sinetskiy.fastjava2.shop.bank.AbstractBank;
import com.sinetskiy.fastjava2.shop.bank.Sberbank;
import com.sinetskiy.fastjava2.shop.bank.VTB;
import com.sinetskiy.fastjava2.shop.client.CommonVisitor;
import com.sinetskiy.fastjava2.shop.goods.Computer;
import com.sinetskiy.fastjava2.shop.goods.Subwoofer;
import com.sinetskiy.fastjava2.shop.goods.Televisor;
import com.sinetskiy.fastjava2.shop.interfaces.BankInterface;
import com.sinetskiy.fastjava2.shop.interfaces.GoodsInterface;

public class Start {

    public static void main(String[] args) {

//        GoodsInterface goods  = new Televisor("Samsung");
//
//        ((Televisor) goods).selectChannel(); // DOWNCAST
//
//        Subwoofer subwoofer = new Subwoofer("Microlab");
//
//        GoodsInterface computer = new Computer("MacBook");
//        GoodsInterface computer2 = new Computer("Asus");
//
//        CommonVisitor commonVisitor = new CommonVisitor();
//
//        commonVisitor.buy(goods);
//        commonVisitor.buy(computer);
//        commonVisitor.buy(computer2);
//        commonVisitor.buy(subwoofer);

        BankInterface sberbank = new Sberbank("Sber", "Russian bank");
        sberbank.checkInfo();
        sberbank.checkInfo();
        sberbank.checkInfo();

        BankInterface vtb = new VTB("VTB", "Russian bank");
        vtb.checkInfo();
        vtb.checkInfo();

        System.out.println("Sberbank.requestCount = " + Sberbank.requestCount);
        System.out.println("VTB.requestCount = " + VTB.requestCount);
        System.out.println("AbstractBank.requestCount = " + AbstractBank.requestCount);

    }
}
