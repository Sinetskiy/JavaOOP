package com.sinetskiy.fastjava2.shop.goods;

import com.sinetskiy.fastjava2.shop.department.AbstractDepartment;
import com.sinetskiy.fastjava2.shop.interfaces.DepartmentInterface;
import com.sinetskiy.fastjava2.shop.interfaces.GoodsInterface;

public abstract class AbstractGoods implements GoodsInterface{

    public static final int DEFAULT_GUARANTEE = 2; // константа

    //свойства, которые будут иметь все товары
    private double price;
    private boolean hasGuarantee;
    private String name;
    private AbstractDepartment department;
    private String company;

    public AbstractGoods() {
    }

    public AbstractGoods(String name) {
        this.name = name;
    }

    public AbstractGoods(double price, boolean hasGuarantee, String name, String company) {
        this.price = price;
        this.hasGuarantee = hasGuarantee;
        this.name = name;
        this.company = company;
    }

    public static void print(String message){
        System.out.println("message = " + message + " => " + DEFAULT_GUARANTEE); // статичная переменная в статичном контексте
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean hasGuarantee() {
        return hasGuarantee;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }

    @Override
    public void setDepartment(AbstractDepartment department) {
        this.department = department;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String getCompany() {
        return company;
    }
}
