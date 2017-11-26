package com.sinetskiy.fastjava2.shop.bank;

public class Sberbank extends AbstractBank {

    public Sberbank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    protected String getInfo() {
        return "Sberbank";
    }

    @Override
    public void checkInfo() {
        super.checkInfo();
        //доработанная реализация
    }

    @Override
    public void giveCredit() {

        //доработанная реализация
    }

    // сбербанк также умеет рассматривать срочные заявки с помошью перегруженного метода
    public void checkInfo(boolean critical) {
        if(critical){
            System.out.println("Critical Sberbank !!!");
            return;
        }
        super.checkInfo();
    }

//    public String checkInfo(){ // !!! нельзя перегрузить метод по выходному параметру !!
//        return "Sberbank";
//    }

}
