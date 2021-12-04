package mainPackage;

public abstract class CarPart implements CarPartInterface{
    String name;
    int condition;

    public CarPart(String name){
        this.name = name;
        this.condition = 100;
        System.out.println();
        System.out.println("Adding part: " + name);
    }

    public void status(){
        if(this.condition < 20){
            System.out.println("Warning: Maintenance required on CarPart:" + this.name);
        }

        System.out.println(this.name + " Condition: " + this.condition);
    }

    public int getOther(){
        return this.condition;
    }
    public void setOther(){}

    public void decreaseCondition(int amount){

        if(this.condition < 30){
            System.out.println();
        }

        if(this.condition - amount >= 0){
            this.condition -= amount;

        } else {
            this.condition = 0;
        }
    }

    @Override
    public void function(){
        decreaseCondition(10);
        status();
        System.out.println();
    }
    public void function(int amount){
        decreaseCondition(amount);
        status();
        System.out.println();
    }
}
