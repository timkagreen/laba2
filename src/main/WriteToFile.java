package main;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile extends Vehicle implements IWriteToFile{
    FileWriter fileWriter;
    public WriteToFile(String path) throws IOException {
        fileWriter = new FileWriter(path, false);
    }



    @Override
    public void writeToFile(Vehicle vehicle) throws IOException {
        String string = vehicle.getClass() + ";" + vehicle.getMark() +
                ";" + vehicle.getModel() +
                ";" + Double.toString(vehicle.getMaxPermissibleMass())+
                ";" + Integer.toString(vehicle.getMaxSpeed()) +
                ";" + Short.toString(vehicle.getNumberOfPassengers())+ ";" + "\r\n";
        fileWriter.write( string, 11, string.length()-11);
        fileWriter.flush();
    }

    public void close() throws IOException {
        fileWriter.close();
    }
}
