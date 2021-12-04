package mainPackage;

public class Radio extends CarPart implements CarPartInterface {
    Engine engine;
    boolean power = false;
    double station = 101.5;

    //Constructor
    public Radio(Engine engine){
        super("Radio");
        this.engine = engine;
        System.out.println("Radio is off");
    }

    //Unique Methods
    public void setStation(double station){
        this.station = station;
        System.out.println("Setting station...");
        System.out.println("Tuned to: " + this.station);
    }
    public void togglePower(){
        System.out.println("Switching radio power...");
        if(this.engine.getOther() == 1){

            this.power = !this.power;
            System.out.println("Radio is " + (this.power ? "on" : "off"));

            if (this.power){
                System.out.println("Tuned to: " + this.station);
                super.function();
            }
        }
        else {
            System.out.println("No power from engine!");
        }
    }

    //Overridden Methods
    @Override
    public void function(){
        this.togglePower();
        if(this.power){
            this.setStation(107.3);
        }
        System.out.println();
    }
}
