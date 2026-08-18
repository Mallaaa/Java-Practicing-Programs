package PolyMorphism;

public class Main {

    public static void main() {
        Car car=new Car();
        Bike bike=new Bike();
        Bus bus=new Bus();

        Vechile[] vechiles={car,bike,bus};

        for(Vechile vecs:vechiles){
            vecs.go();
        }
    }
}
