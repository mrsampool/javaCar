package mainPackage;

import java.util.ArrayList;

public class Car {

    ArrayList<CarPart> partsArray = new ArrayList<CarPart>();

    public Car(){
        System.out.println("Assembling car...");

        //Add Body
        partsArray.add(new Body("Subaru Forester"));

        //Add Wheels
        Wheels wheelsObj = new Wheels();
        partsArray.add(wheelsObj);

        //Create FuelTank, Engine, & Radio (Dependent Methods)
        FuelTank fuelTankObj = new FuelTank();
        Engine engineObj = new Engine(4,fuelTankObj);
        Radio radioObj = new Radio(engineObj);

        //Add Dependent Parts To Car
        partsArray.add(engineObj);
        partsArray.add(fuelTankObj);
        partsArray.add(radioObj);

        System.out.println();
        System.out.println("Car assembled!");

        System.out.println("--------");
        System.out.println();
    }

    public void drive(){
        System.out.println("Car is driving!");
        System.out.println(">>>>>>>>>>>>>>>");
        System.out.println("Car is stopped.");
        partsArray.get(1).function();
        partsArray.get(3).setOther();
    }

    public void run(){

        for(CarPart part : partsArray){
            part.function();
        }
        System.out.println("-----------");
        System.out.println("Let's try this again...");

        //Oops, looks like we got ahead of ourselves...
        //Turn on Engine (With fuel this time...)
        partsArray.get(2).function();

        //Turn on radio (With power this time...)
        partsArray.get(4).function();

        //Close the door
        partsArray.get(0).function();

        //Drive the car!
        drive();

        //Turn off engine
        partsArray.get(2).function();
    }
}
