package InheritenceExmp;

public class Employee extends Person{


    double salary;
    Employee(String fname,String lname, double salary){
        super(fname,lname);
        this.salary=salary;

    }
    void showsalary(){
        System.out.println(this.fname);
        System.out.println(this.lname);
        System.out.println(this.salary);
    }
}
