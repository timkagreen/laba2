package main;

public abstract class Vehicle {
    protected String mark;
    protected String model;
    protected double maxPermissibleMass;
    protected short numberOfPassengers;
    protected int maxSpeed;

    public Vehicle(){

    }

    public Vehicle(String mark, String model, double maxPermissibleMass, short numberOfPassengers, int maxSpeed){
        this.mark = mark;
        this.model = model;
        this.maxPermissibleMass = maxPermissibleMass;
        this.numberOfPassengers = numberOfPassengers;
        this.maxSpeed = maxSpeed;
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

    public String toString(){
        return "Марка: " + getMark() +
                " " + getModel() +
                " | максимальная допустимая масса перевозимого груза: " + Double.toString(getMaxPermissibleMass())+
                " | максимальная скорость: " + Integer.toString(getMaxSpeed()) +
                " | число пассажиров: " + Short.toString(getNumberOfPassengers());
    }

}