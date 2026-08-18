package Interface;

public class Main {
    public static void main(){

        Hawk hawk=new Hawk();
        Rabbit rabbie=new Rabbit();
        Fish fish =new Fish();
        rabbie.flee();
        hawk.Hunt();
        fish.flee();
        fish.Hunt();

    }
}
