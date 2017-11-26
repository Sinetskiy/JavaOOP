package com.sinetskiy.fastjava2.shop;

import com.sinetskiy.fastjava2.shop.interfaces.DepartmentInterface;
import com.sinetskiy.fastjava2.shop.interfaces.VisitorInterface;
import com.sinetskiy.fastjava2.shop.staff.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    public static final String SHOP_NAME = "TechnoDom";

    private ArrayList<DepartmentInterface> departmentList = new ArrayList<DepartmentInterface>(); // в каждом депараменте имеются свои сотрудники
    private ArrayList<VisitorInterface> visitorList = new ArrayList<VisitorInterface>();

    public ArrayList<DepartmentInterface> getDepartmentList() {
        return departmentList;
    }

    public void addDepartment(DepartmentInterface department) {
        departmentList.add(department);
    }

    public void addVisitor(VisitorInterface visitor) {
        visitorList.add(visitor);
    }
}
