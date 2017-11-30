package collections.enumMapSet;

public class Car implements Comparable<Car> {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if( this == obj )return true;
        if(! (obj instanceof Car)) return false;

        Car car = (Car) obj;

        if(!name.equals(car.name)) return false;

        return true;
    }

    @Override
    public int compareTo(Car car) {
        return this.name.compareTo(car.getName());
    }

    @Override
    public String toString() {
        return "Car(" +
                "name= " + name + '\'' +
                ')';
    }
}
