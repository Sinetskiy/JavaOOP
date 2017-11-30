package collections.enumMapSet;

import java.util.*;

public class Start {

    public static void main(String[] args) {

        EnumSet<Weekday> holydays = EnumSet.of(Weekday.SATURDAY, Weekday.SUNDAY);

        for ( Weekday holyday : holydays){ // подмножество выходных дней
            System.out.println("holyday = " + holyday);
        }
        
        List<Car> minivanCars = new ArrayList<Car>();
        minivanCars.add(new Car("Toyota"));
        minivanCars.add(new Car("BMW"));

        List<Car> sportCars = new ArrayList<Car>();
        sportCars.add(new Car("Lexus"));
        sportCars.add(new Car("Audi"));
        
        EnumMap<CarType, List<Car>> enumMap = new EnumMap<CarType, List<Car>>(CarType.class);
        
        enumMap.put(CarType.MINIVAN, minivanCars);
        enumMap.put(CarType.SPORT, sportCars);

        iteratorMap(enumMap);

        List<Car> sportCarsList = enumMap.get(CarType.SPORT); // только спорт автомобили

    }

    private static void iteratorMap(Map map) {
        System.out.println();
        Iterator<Map.Entry<CarType, Car>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<CarType, Car> carEntry = iterator.next();
            System.out.println(carEntry.getKey() + " - " + carEntry.getValue());
        }

    }

}
