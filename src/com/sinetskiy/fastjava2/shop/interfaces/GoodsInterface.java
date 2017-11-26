package com.sinetskiy.fastjava2.shop.interfaces;

public interface GoodsInterface {

    double getPrice();
    boolean hasGuarantee();
    String getName();
    DepartmentInterface getDepartment();
    String getCompany();

}
