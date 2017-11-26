package com.sinetskiy.fastjava2.shop.interfaces;

import java.util.ArrayList;

public interface DepartmentInterface {

    String getName();
    ArrayList<EmployeeInterface> getEmployeeList();
    ArrayList<GoodsInterface> getGoodsList();

}