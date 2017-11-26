package com.sinetskiy.fastjava2.shop.staff;

import com.sinetskiy.fastjava2.shop.enums.ConsultResult;
import com.sinetskiy.fastjava2.shop.interfaces.DepartmentInterface;
import com.sinetskiy.fastjava2.shop.interfaces.VisitorInterface;

public class Consultant extends AbstractEmployee {

    public Consultant() {
    }

    public Consultant(String name) {
        super(name);
    }

    @Override
    public void setDepartment(DepartmentInterface department) {
        super.setDepartment(department);
    }

    public ConsultResult consult(VisitorInterface visitor){
        super.setFree(false);

        // здесь должна быть логика, купит или пойдет домой

        return ConsultResult.BUY;
    }

    public void send(){

    }

}
