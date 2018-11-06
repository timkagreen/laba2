package main;

public class Bus extends Vehicle{
    public Bus() {
        super();
    }

    public Bus(String mark, String model, double maxPermissibleMass, short numberOfPassengers, int maxSpeed) {
        super(mark, model, maxPermissibleMass, numberOfPassengers, maxSpeed);
    }

    @Override
    public String getMark() {
        return super.getMark();
    }

    @Override
    public void setMark(String mark) {
        super.setMark(mark);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public double getMaxPermissibleMass() {
        return super.getMaxPermissibleMass();
    }

    @Override
    public void setMaxPermissibleMass(double maxPermissibleMass) {
        super.setMaxPermissibleMass(maxPermissibleMass);
    }

    @Override
    public short getNumberOfPassengers() {
        return super.getNumberOfPassengers();
    }

    @Override
    public void setNumberOfPassengers(short numberOfPassengers) {
        super.setNumberOfPassengers(numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        super.setMaxSpeed(maxSpeed);
    }
}
