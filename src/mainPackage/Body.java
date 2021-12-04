package mainPackage;

public class Body extends CarPart implements CarPartInterface{
    String type;
    boolean driverDoor = false;

    //Constructor
    public Body(String type){
        super("Body");
        this.type = type;
        System.out.println("Body Type: " + this.type);
    }

    //Overridden Methods
    public void function(){
        this.driverDoor = !this.driverDoor;
        System.out.println("Driver door is " + (this.driverDoor ? "open" : "closed"));

        super.function(1);
    }
}
