package com.sinetskiy.fastjava2.shop.goods;

import com.sinetskiy.fastjava2.shop.department.AbstractDepartment;
import com.sinetskiy.fastjava2.shop.interfaces.DepartmentInterface;
import com.sinetskiy.fastjava2.shop.interfaces.GoodsInterface;

public abstract class AbstractGoods implements GoodsInterface{

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
    public String getCompany() {
        return company;
    }
}
