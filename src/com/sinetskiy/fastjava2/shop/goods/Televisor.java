package com.sinetskiy.fastjava2.shop.goods;

public class Televisor extends ElectronicDevice{

     private String model;

     public Televisor(String name){
          super(name);
     }

     public void selectChannel(){
          System.out.println("select channel ...");
     }

     public void selectChannel(int number){  // перегрузка
          System.out.println("selected channel with number " + number);
     }

     public void selectChannel(String name){ // перегрузка
          System.out.println("selected channel with name " + name);
     }

}
