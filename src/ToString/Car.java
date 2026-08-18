package ToString;

public class Car {

    String name;
    String color;
    int model;
     Car(String name,String color,int model){
        this.name=name;
        this.color=color;
        this.model=model;

    }

    public String toString(){
        return this.name+" "+this.color+" "+this.model+" ";    }
}
