package com.sinetskiy.fastjava2.shop.goods;

import com.sinetskiy.fastjava2.shop.department.BaseDepartment;
import com.sinetskiy.fastjava2.shop.interfaces.DepartmentInterface;
import com.sinetskiy.fastjava2.shop.interfaces.GoodsInterface;

public abstract class BaseGoods implements GoodsInterface{

    //свойства, которые будут иметь все товары
    private double price;
    private boolean hasGuarantee;
    private String name;
    private BaseDepartment department;
    private String company;

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
