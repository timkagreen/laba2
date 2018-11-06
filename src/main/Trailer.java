package main;

public class Trailer{
    protected String mark;
    protected String model;
    protected double maxPermissibleMass;
    protected short numberOfPassengers;
    protected int maxSpeed;


    public Trailer() {
        super();
    }

    public Trailer(String mark, String model, double maxPermissibleMass, short numberOfPassengers) {
        this.mark = mark;
        this.model = model;
        this.maxPermissibleMass = maxPermissibleMass;
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMaxPermissibleMass() {
        return maxPermissibleMass;
    }

    public void setMaxPermissibleMass(double maxPermissibleMass) {
        this.maxPermissibleMass = maxPermissibleMass;
    }

    public short getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(short numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public String toString() {
        return "Марка: " + getMark() +
                " | модель: " + getModel() +
                " | максимальная допустимая масса перевозимого груза: " + Double.toString(getMaxPermissibleMass())+
                " | число пассажиров: " + Short.toString(getNumberOfPassengers());
    }


}
