import java.util.*;

class Student {
    private String name;
    private int roll;
}

class Employee {
    private String name;
    private int roll;
}

public class Generics {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();
        Employee e = new Employee();
        Employee e1 = new Employee();
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s);
        al.add(s1);
        System.out.println(al);
        // al.add(e); //cannot insert an employee type of object
        // Generics ensure that type safety is enforced in a collection since they're
        // dynamic and heterogenous in nature
    }
}
