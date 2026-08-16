package JavaSlotGame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        double amount=0;
        double totalbalance=0;

        System.out.println("****************");
        System.out.println("Wellcome Java Slots Game:");
        System.out.println("****************");
        System.out.println("1.Add Amount to Your Account");
        System.out.println("2.Play Game");
        System.out.println("3.Withdrawl Amount");
        System.out.println("4. Balance Check");
        System.out.println("5.Exit the Application");
        boolean isExit=true;

        do{
            System.out.println("Enter your Choice:-");
            int choice=scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    amount=addamount();
                    if(amount<=0){
                        System.out.println("  ");
                    }else {
                        System.out.printf("amount added %.2f\n", amount);
                        totalbalance+=amount;
                    }
                }
                case 2 -> {
                    totalbalance=playgames(totalbalance);
                }
                case 3 -> {
                    totalbalance=Withdrawl(totalbalance);
                }
                case 4 -> System.out.println(totalbalance);

                case 5 -> {
                    System.out.println("Exited !!!!!");
                    isExit=false;
                }

                default -> System.out.println("Invalid Choice!!!");
            }

        }while (isExit);
    }
    static double addamount(){
        double amount=0;
        System.out.println("Enter your amount to add:");
        int usramount=scanner.nextInt();
        if(usramount<=0){
            System.out.println("please enter valid amount to add");
            return 0;
        }else{
            amount+=usramount;
        }
        return amount;
    }
    static double Withdrawl(double totalbalance){

        double withdrawlamt;
        System.out.print("Enter Amount to Withdrawl:");
        withdrawlamt=scanner.nextDouble();

        if (withdrawlamt<=0){
            System.out.println("enter valid amount to withdrawl ");

        }else if(withdrawlamt>totalbalance){
            System.out.println("Insuficient Funds");
        }else if(withdrawlamt<totalbalance){
            System.out.println("hi");
            totalbalance-=withdrawlamt;
            System.out.printf("Withdrawl Sucessfully of %.2f",withdrawlamt);
        }
        return totalbalance;
    }

    static double playgames(double totalbal){
        System.out.println("************** Happy Gaming *********");

        int betamount=0;
        String[] symbols={"😂","😘","🥲","🥵"};
        Random random=new Random();


        System.out.println("enter bet amount:");
        betamount=scanner.nextInt();

        if(betamount<=0){
            System.out.println("Bet amount should be greater than 0");
        }else if(betamount>totalbal){
            System.out.println("Insufficient Funds!!!!");

        }else{
            String[] remj=new String[3];
            System.out.println("||||||| Shuflling |||||");
            for(int i=0;i<3;i++){

                remj[i]=symbols[random.nextInt(symbols.length)];
                System.out.printf("  "+remj[i]);
            }

            if(remj[0].equals(remj[1])||remj[0].equals(remj[2])||remj[1].equals(remj[2])){
                System.out.println("You Won the game!");
                betamount*=0.5;
                totalbal+=betamount;
                System.out.printf("Your Balance %.2f",totalbal);
                return totalbal;
            }else if(remj[0].equals(remj[1])&&remj[0].equals(remj[2])){
                System.out.println("jackPot You Doubled your Amount");
                betamount*=2;
                totalbal+=betamount;

                System.out.printf("Your Balance %.2f",totalbal);
                return totalbal;
            }else{
                System.out.println("You Lost");
                return totalbal-=betamount;
            }
        }
        return  totalbal;
    }

}
