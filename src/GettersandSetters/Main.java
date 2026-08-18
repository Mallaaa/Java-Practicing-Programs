package GettersandSetters;

public class Main {

    public static void main() {



        Car car = new Car("BMW", "White", 324567);
        System.out.println(car.getColor());

        car.details();

        car.setColor("Blue");
        car.setPrice(23456778);
        System.out.println(car.getColor());
        car.details();
    }
}
