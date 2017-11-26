package com.sinetskiy.fastjava2.shop;

import com.sinetskiy.fastjava2.shop.interfaces.DepartmentInterface;
import com.sinetskiy.fastjava2.shop.interfaces.VisitorInterface;
import com.sinetskiy.fastjava2.shop.staff.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    public static final String SHOP_NAME = "TechnoDom";

    private ArrayList<DepartmentInterface> departmentList; // в каждом депараменте имеются свои сотрудники
    private ArrayList<VisitorInterface> visitorList;
    private Administrator administrator;

}
