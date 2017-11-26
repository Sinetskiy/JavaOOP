package com.sinetskiy.fastjava2.shop.interfaces;

import com.sinetskiy.fastjava2.shop.department.AbstractDepartment;

public interface GoodsInterface {

    double getPrice();
    boolean hasGuarantee();
    String getName();
    DepartmentInterface getDepartment();
    String getCompany();

    void setDepartment(AbstractDepartment abstractDepartment);
}
