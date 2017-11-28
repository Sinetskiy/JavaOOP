package collections.compare;

import java.util.*;

public class Start {

    private static ArrayList<Car> cars = new ArrayList<>();
    
    public static void main(String[] args) {

        Car car1 = new Car("BMW",1999);
        Car car2 = new Car("NIVA", 2004);
        Car car3 = new Car("Opel", 2013);
        Car car4 = new Car("Nissan", 1990);
        
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        print(cars);

        Collections.sort(cars);
        System.out.println();
        print(cars);

        System.out.println("cars.get(2).getName() = " + cars.get(2).getName()); // при сортировке меняются и индексы элементов

        CarYearComparator carYearComparator = new CarYearComparator();

        Collections.sort(cars, carYearComparator);
        print(cars);
        System.out.println();

        TreeSet<Car> carsSet = new TreeSet<Car>(carYearComparator); // инициализаци коспоратора для sorted коллекции

        carsSet.add(car1);
        carsSet.add(car2);
        carsSet.add(car3);
        carsSet.add(car4);

        System.out.println("===== TreeSet =====");
        print(carsSet);

    }
    
    public static void print(Collection cars){

        System.out.println();
        Iterator<Car> iterator = cars.iterator();
        
        while (iterator.hasNext()){
            Car car = iterator.next();
            System.out.println(car.getName() + ", " + car.getYear());
        }
        
    }
}
