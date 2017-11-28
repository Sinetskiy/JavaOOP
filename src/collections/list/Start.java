package collections.list;

import collections.generic.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Start {

    public static void main(String[] args) {
        System.out.println("====== ArrayList =======");
        arrayListExample();
        System.out.println("====== LinkedList =======");
        linkedListExample();

    }

    private static void linkedListExample() {

        LinkedList<Car> cars = new LinkedList();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Toyota");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        cars.addLast(car1);
        cars.addFirst(car4);

        Iterator<Car> iterator = cars.descendingIterator(); // итератор в обратную сторону

        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }

    private static void arrayListExample() {

        ArrayList<Car> cars = new ArrayList();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");
        
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);  // можно добавлять дубли
        
        cars.add(new Car("Toyota")); // создание обьекта в мете добавления

        System.out.println("cars.size() = " + cars.size()); // размер коллекции
        System.out.println("cars.contains(car2) = " + cars.contains(car2)); // создержит ли коллекция опредленный обект 
        
        int index = cars.indexOf(car3);
        System.out.println("index = " + index); // получение индекса элемента
        
        Car selectedCar = cars.get(3); // получение объекта по индексу
        System.out.println("selectedCar = " + selectedCar.getName());
        
        // ordered
        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }

        cars.clear(); // очистка кллекции
        System.out.println("cars.isEmpty() = " + cars.isEmpty()); // проверка на пустоту

//         selectedCar = cars.get(3) ; // ошибка IndexOutOfBoundsException, т.к. по этому индексу нет обьекта
    }
}
