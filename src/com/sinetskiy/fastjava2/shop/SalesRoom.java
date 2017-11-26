package com.sinetskiy.fastjava2.shop;

import com.sinetskiy.fastjava2.shop.client.BaseVisitor;
import com.sinetskiy.fastjava2.shop.department.BaseDepartment;
import com.sinetskiy.fastjava2.shop.service.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    private ArrayList<BaseDepartment> departmentList; // в каждом депараменте имеются свои сотрудники
    private String name;
    private ArrayList<BaseVisitor> visitorList;
    private Administrator administrator;

}
