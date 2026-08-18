package InheritenceExmp;

public class Main {
    public static void main(String[] args){
       Employee emp1=new Employee("ramu","Gowda",34455.66);
       Person per1=new Person("raju","rao");
       Student sud1=new Student("manu","sagar",112);

       sud1.pDetails();
       emp1.showsalary();

    }


}
