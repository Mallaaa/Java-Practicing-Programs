package GettersandSetters;

public class Car {
    private final String name;
    private String Color;
    private int price;

    Car(String name,String Color,int price){
        this.name=name;
        this.Color=Color;
        this.price=price;
    }
    String getName(){
        return this.name;
    }
    String getColor(){
        return this.Color;
    }
    int getPrice(){
        return this.price;
    }
    void setColor(String color){
        this.Color=color;
    }

    void setPrice(int price){
        this.price=price;
    }

    void details(){
        System.out.println("The Car is  "+this.name+ " The Color Is "+this.Color+" And the Price of the Car is "+this.price);
    }
}
