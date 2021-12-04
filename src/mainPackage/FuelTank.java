package mainPackage;

public class FuelTank extends CarPart implements CarPartInterface{
    int fuelLevel;

    //Constructor
    public FuelTank(){
        super("Fuel Tank");
        this.fuelLevel = 0;
        checkFuel();
    }

    //Unique Methods
    public void addFuel(){
        System.out.println("Adding fuel...");
        this.fuelLevel = 100;
    }
    public void useFuel(){
        this.fuelLevel -= 10;
        this.checkFuel();
    }
    public void checkFuel(){
        System.out.println("Fuel Level: " + this.fuelLevel);
    }

    //Overridden Methods
    @Override
    public int getOther(){
        return this.fuelLevel;
    }
    @Override
    public void setOther(){
        useFuel();
    }
    @Override
    public void status(){
        if(this.fuelLevel < 25){
            System.out.println("Warning: Fuel Level Low");
        }
        System.out.println("Fuel Level: " + this.condition);
    }
    @Override
    public void function(){
        addFuel();
        status();
        System.out.println();
    }
}
