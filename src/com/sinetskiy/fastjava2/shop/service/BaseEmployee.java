package com.sinetskiy.fastjava2.shop.service;

import com.sinetskiy.fastjava2.shop.interfaces.DepartmentInterface;
import com.sinetskiy.fastjava2.shop.interfaces.EmployeeInterface;

public abstract class BaseEmployee implements EmployeeInterface {

    private String name;
    private DepartmentInterface department;
    private boolean free;

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(DepartmentInterface department) {
        this.department = department;
    }

    public void setFree(boolean free) {
        this.free = free;
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
    public boolean isFree() {
        return free;
    }
}
