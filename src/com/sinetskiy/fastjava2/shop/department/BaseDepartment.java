package com.sinetskiy.fastjava2.shop.department;

import com.sinetskiy.fastjava2.shop.goods.BaseGoods;
import com.sinetskiy.fastjava2.shop.interfaces.DepartmentInterface;
import com.sinetskiy.fastjava2.shop.interfaces.EmployeeInterface;
import com.sinetskiy.fastjava2.shop.interfaces.GoodsInterface;
import com.sinetskiy.fastjava2.shop.service.BaseEmployee;

import java.util.ArrayList;

public class BaseDepartment implements DepartmentInterface {

    private String name;
    private ArrayList<EmployeeInterface> employeeList;
    private ArrayList<GoodsInterface> goodsList;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeList(ArrayList<EmployeeInterface> employeeList) {
        this.employeeList = employeeList;
    }

    public void setGoodsList(ArrayList<GoodsInterface> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList() {
        return employeeList;
    }

    @Override
    public ArrayList<GoodsInterface> getGoodsList() {
        return goodsList;
    }
}
