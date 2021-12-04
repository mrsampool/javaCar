package mainPackage;

public class Wheels extends CarPart implements CarPartInterface{
    String tireType;
    int psi = 0;

    //Constructor
    public Wheels(){
        super("Wheels");
        this.tireType = "All Terrain";
        System.out.println("Tire Type: " + this.tireType);
        checkPsi();
    }

    //Unique Methods
    public void checkCondition(){
        System.out.println("Wheel condition: " + this.condition);
    }
    public void checkPsi(){
        if(psi < 35){
            System.out.println("Warning - Low Tire Pressure");
        }
        System.out.println("Tire PSI: " + psi);
    }
    public void airTires(){
        System.out.println("Airing tires...");
        this.psi = 35;
    }
    public void driveTires(){
        super.function();
    }

    //Overridden Methods
    @Override
    public void status(){
        checkCondition();
        checkPsi();
    }
    @Override
    public void function(){
        if(this.psi < 35){
            airTires();
            checkPsi();
        } else {
            driveTires();
        }
        System.out.println();
    }

}
