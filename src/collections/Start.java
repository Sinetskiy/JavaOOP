package collections;

import java.util.*;

public class Start {

    public static void main(String[] args) {
        example();
    }

    private static void example() {

        System.out.println("=======HashSet=========");
        hashSetExample();
        System.out.println("=======Ordered=========");
        linkedHashSetExample();
        System.out.println("=======Sorted==========");
        treeSetExample();

    }

    private static void linkedHashSetExample() {

        LinkedHashSet set = new LinkedHashSet();

        set.add(32);
        set.add(322);
        set.add(132);
        set.add(532);
        set.add(352);
        set.add(3298);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void treeSetExample() {

        Set tree = new TreeSet();
        tree.add(34);
        tree.add(21);
        tree.add(67);
        tree.add(345);
        tree.add(33);
        tree.add(3343);
        tree.add(23);

        Iterator iterator = tree.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }

    }

    private static void hashSetExample() {

        Set cars = new HashSet();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4); // добавление дубликатов

        // переход по колекции с помощью итератора
        Iterator iterator = cars.iterator();

        // not ordered - порядок получения не такой же, как порядок вставки
        while(iterator.hasNext()){
            Car car = (Car) iterator.next();
            System.out.println(car.getName());
        }

    }
}
