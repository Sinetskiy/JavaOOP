package com.sinetskiy.fastjava2.main;

import com.sinetskiy.fastjava2.objects.Phone;

public class Start {

    public static void main(String[] args) {

        Phone phone = new Phone(1024, "Samsung", "GSM");

        System.out.println("phone.getName() = " + phone.getName());

        phone.setName("iPhone");

        System.out.println("phone.getName() = " + phone.getName());
        System.out.println("phone.getType() = " + phone.getType());
    }
}
