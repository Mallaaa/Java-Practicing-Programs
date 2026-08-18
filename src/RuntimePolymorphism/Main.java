package RuntimePolymorphism;

import java.util.Scanner;

public class Main {

    public static void main() {

        Scanner scanner =new Scanner(System.in);
        Animal animal;

        System.out.println("Would you like dog or cat?(1==Dog,2==Cat):");
        int choice= scanner.nextInt();

        if(choice==1){
            animal=new Dog();
            animal.speak();
        }else if (choice==2){
            animal=new Cat();
            animal.speak();
        }else{
            System.out.println("Invalid Choice");
        }

    }
}