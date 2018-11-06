package main;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReadFromFile extends Vehicle {
    private FileReader fileReader;
    private Scanner scanner;

    public ReadFromFile(String path) throws IOException {
        fileReader = new FileReader(path);
        scanner = new Scanner(fileReader);
    }

    public Object readFromFile() throws IOException {
        while (scanner.hasNextLine()) {
            StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine(), ";");
            while (stringTokenizer.hasMoreTokens()) {
                if (stringTokenizer.countTokens() == 6){
                     switch (stringTokenizer.nextToken()){
                         case "Car":
                             Car car1 = new Car(stringTokenizer.nextToken(), stringTokenizer.nextToken(),Double.parseDouble(stringTokenizer.nextToken()),Short.parseShort(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
                             return car1;
                         case "Bus":
                             Bus bus = new Bus(stringTokenizer.nextToken(), stringTokenizer.nextToken(),Double.parseDouble(stringTokenizer.nextToken()),Short.parseShort(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
                             return bus;
                         case "Motorcycle":
                             Motorcycle motorcycle = new Motorcycle(stringTokenizer.nextToken(), stringTokenizer.nextToken(),Double.parseDouble(stringTokenizer.nextToken()),Short.parseShort(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
                             return motorcycle;
                         case "Truck":
                             Truck truck = new Truck(stringTokenizer.nextToken(), stringTokenizer.nextToken(),Double.parseDouble(stringTokenizer.nextToken()),Short.parseShort(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
                             return truck;

                     }
                }
            }
        }
        return "";
    }

    public void close() throws IOException {
        fileReader.close();
    }
}
