package collections.sets;

public class Car {

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
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if( this == obj )return true;
        if(! (obj instanceof Car)) return false;

        Car car = (Car) obj;

        if(!name.equals(car.name)) return false;

        return true;
    }
}