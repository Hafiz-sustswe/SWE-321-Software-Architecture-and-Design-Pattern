import java.util.Stack;

class Vehicle {
    public int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

interface Bike {
    //int numGears;
    public void setnumGears(int numGears);
    public void getnumGears();
}
class standardBike implements Bike {


    private int numGears;

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }

    public int getNumGears() {
        return numGears;
    }
    public void setSpeed(int speed) {
        if (speed > 60) {
            throw new IllegalArgumentException("Bikes cannot go faster than 60 km/h");
        }

    }

    @Override
    public void setnumGears(int numGears) {

    }

    @Override
    public void getnumGears() {

    }
}

 class Car extends Vehicle {
    private int maxSpeed;

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}



public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new ();
        vehicle.setSpeed(70); // This will throw an IllegalArgumentException
    }
}
