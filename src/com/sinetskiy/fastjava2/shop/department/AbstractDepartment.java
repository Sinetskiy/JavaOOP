package com.sinetskiy.fastjava2.shop.department;

import com.sinetskiy.fastjava2.shop.interfaces.DepartmentInterface;
import com.sinetskiy.fastjava2.shop.interfaces.EmployeeInterface;
import com.sinetskiy.fastjava2.shop.interfaces.GoodsInterface;

import java.util.ArrayList;

public abstract class AbstractDepartment implements DepartmentInterface {

    public AbstractDepartment() {
    }

    public AbstractDepartment(String name) {
        this.name = name;
    }

    private String name;
    private ArrayList<EmployeeInterface> employeeList = new ArrayList<EmployeeInterface>();
    private ArrayList<GoodsInterface> goodsList = new ArrayList<GoodsInterface>();

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

    public void addEmployee(EmployeeInterface epmloyee) {
        epmloyee.setDepartment(this);
        employeeList.add(epmloyee);
    }

    public void addGoods(GoodsInterface goods){
        goods.setDepartment(this); // при добавлении товара для него автоматически прописывается отедел
        goodsList.add(goods);
    }

}
