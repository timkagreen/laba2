package main;


/**
* Вариант 5.
* 1.	Разработать иерархию классов – транспортных средств: мотоцикл, автомобиль, грузовик, автобус, прицеп.
* У объектов – ТС имеются следующие свойства: марка, модель, максимальная допустимая масса перевозимого груза, кол-во пассажиров, максимальная скорость.
* 2.	Задать методы, с помощью которых можно получить значения свойств.
* 3.	Разработать программу для демонстрации классов.
* Необходимо учесть, что у ТС с прицепом общая допустимая снаряженная масса состоит из суммы значений буксирующего ТС и прицепа.
* Так же необходимо учесть, что по ПДД максимальная разрешенная скорость ТС с прицепом по на 20км/ч чем без него.
*/



public class TestMain {
    public static void main(String[] args) throws Exception{
        Car car = new Car("fasf", "afs", 2 , (short) 5, 120);
        WriteToFile writeToFile = new WriteToFile("output.txt");
        writeToFile.writeToFile(car);
        Car car2 = new Car("car2", "afs", 2 , (short) 5, 120);
        writeToFile.writeToFile(car2);

        System.out.println(car);
        System.out.println(car2);


        ReadFromFile readFromFile = new ReadFromFile("output.txt");
        Vehicle vehicle1 = (Vehicle) readFromFile.readFromFile();
        System.out.println(vehicle1);
        Vehicle vehicle2 = (Vehicle) readFromFile.readFromFile();
        System.out.println(vehicle2);

        writeToFile.close();
        readFromFile.close();
    }
}


