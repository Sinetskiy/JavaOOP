package collections.compare;

public class Car implements Comparable<Car> {

    private String name;
    private int year;

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
}
