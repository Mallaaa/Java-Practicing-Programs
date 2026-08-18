package InheritenceExmp;

public class Person  {

    String fname;
    String lname;

    Person(String fname,String lname){
        this.fname=fname;
        this.lname=lname;

    }
    void pDetails(){
        System.out.println("First name is "+this.fname);
        System.out.println("last name is "+this.lname);
    }


}
