package Interface;

public class Fish implements Predator,Prey{

    @Override
    public void Hunt() {
        System.out.println("fish is hunting");
    }

    @Override
    public void flee(){
        System.out.println("Fish is  Running");
    }
}
