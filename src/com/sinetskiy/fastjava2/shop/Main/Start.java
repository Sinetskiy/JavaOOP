package com.sinetskiy.fastjava2.shop.Main;

import com.sinetskiy.fastjava2.shop.SalesRoom;
import com.sinetskiy.fastjava2.shop.client.CommonVisitor;
import com.sinetskiy.fastjava2.shop.client.VipVisitor;
import com.sinetskiy.fastjava2.shop.department.ElectronicDepartment;
import com.sinetskiy.fastjava2.shop.department.GameDepartment;
import com.sinetskiy.fastjava2.shop.enums.ConsultResult;
import com.sinetskiy.fastjava2.shop.goods.Computer;
import com.sinetskiy.fastjava2.shop.goods.GameConsole;
import com.sinetskiy.fastjava2.shop.goods.Televisor;
import com.sinetskiy.fastjava2.shop.staff.Administrator;
import com.sinetskiy.fastjava2.shop.staff.Consultant;

public class Start {

    public static void main(String[] args) {
        imitateShopWorking();
    }

    private static void imitateShopWorking() {

        SalesRoom salesRoom = new SalesRoom(); // создаем торговый зал

        // создаем администратора всего торгового зала
        Administrator administrator = new Administrator(salesRoom);

        // создаем два отдела
        ElectronicDepartment electronicDepartment = new ElectronicDepartment();
        GameDepartment gameDepartment = new GameDepartment();

        // добавляем департаменты в торговый зал
        salesRoom.addDepartment(electronicDepartment);
        salesRoom.addDepartment(gameDepartment);

        // добавляем сотрудников в каждый отдел
        Consultant consultant1 = new Consultant("Jon");
        consultant1.setFree(true);

        Consultant consultant2 = new Consultant("Anna");

        electronicDepartment.addEmployee(consultant1);
        electronicDepartment.addEmployee(consultant2);

        // создаем товары для отедлов
        Computer computer = new Computer(200, true, "Zenbook", "Asus", 2048);
        Televisor televisor = new Televisor(1000, false, "SmartTV", "Samsung");
        GameConsole xbox = new GameConsole("XBOX", 1024);

        // добавляем товары в отделы
        electronicDepartment.addGoods(computer);
        electronicDepartment.addGoods(televisor);
        electronicDepartment.addGoods(xbox);

        // создаем покупателей
        CommonVisitor visitor1 = new CommonVisitor("Andrew");
        VipVisitor vipVisitor1 = new VipVisitor("Andrew", 50);

        // ищем свободного консультанта
        ConsultResult consultResult = administrator.getFreeConsultant(electronicDepartment).consult(visitor1);

        switch (consultResult){
            case BUY:
                visitor1.buy(televisor);
            case EXIT:
                break;
        }

    }
}
