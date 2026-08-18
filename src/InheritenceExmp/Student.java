package InheritenceExmp;

public class Student extends Person{

    int regNo;
    Student(String fname,String lname,int regNo){
        super(fname,lname);
        this.regNo=regNo;
    }

}
