package main;

/**
 * Created by 8160355 on 26.09.2018.
 */
public abstract class ExtendableVehicle extends Vehicle implements IExtendableVehicle {

    public ExtendableVehicle() {
        super();
    }

    public ExtendableVehicle(String mark, String model, double maxPermissibleMass, short numberOfPassengers, int maxSpeed)
    {
        super(mark, model, maxPermissibleMass, numberOfPassengers, maxSpeed);
    }

    @Override
    public void addTrailer(Trailer trailer)
    {
        this.setMark(this.getMark() + " " + trailer.getMark());
        this.setModel(this.getModel() + " " + trailer.getModel());
        this.setMaxPermissibleMass(this.getMaxPermissibleMass() + trailer.getMaxPermissibleMass());
        this.setMaxSpeed(this.getMaxSpeed() - 20);
        this.setNumberOfPassengers((short) (this.getNumberOfPassengers() + (int) trailer.getNumberOfPassengers()));
    }
}
