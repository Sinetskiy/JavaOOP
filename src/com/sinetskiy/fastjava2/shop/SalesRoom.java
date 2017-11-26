package com.sinetskiy.fastjava2.shop;

import com.sinetskiy.fastjava2.shop.interfaces.DepartmentInterface;
import com.sinetskiy.fastjava2.shop.interfaces.VisitorInterface;
import com.sinetskiy.fastjava2.shop.service.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    private ArrayList<DepartmentInterface> departmentList; // в каждом депараменте имеются свои сотрудники
    private String name;
    private ArrayList<VisitorInterface> visitorList;
    private Administrator administrator;

}
