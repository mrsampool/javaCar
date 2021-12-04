package mainPackage;

public class Engine extends CarPart implements CarPartInterface{
    boolean running;
    int numCylinders;
    CarPart fuelTank;

    //Constructor
    public Engine(int numCylinders, FuelTank fuelTank){
        super("Engine");
        this.running = false;
        this.name = "Engine";
        this.numCylinders = numCylinders;
        this.fuelTank = fuelTank;
        System.out.println(numCylinders + "-Cylinder engine.");
    }

    //Unique Methods
    public void startEngine(){

        System.out.println("Turning ignition...");

        if(this.fuelTank.getOther() > 5 ){
            this.running = true;
            System.out.println("Engine is running.");
        }

        else{
            System.out.println("No Fuel In Tank!");
        }
        System.out.println();

    }
    public void stopEngine(){
        this.running = false;
        System.out.println("The engine is no longer running");
        this.status();
    }

    //Overridden Methods
    @Override
    public int getOther(){
        if (this.running){
            return 1;
        } else {
            return 0;
        }
    }
    @Override
    public void function(){
        if(!this.running){
            startEngine();
            super.function();
        } else {
            stopEngine();
        }
    }
}
