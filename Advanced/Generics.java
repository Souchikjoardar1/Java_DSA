import java.util.*;

class Student {
    String name;
    int roll;

    Student(String n, int r) {
        this.name = n;
        this.roll = r;
    }
}

class Employee {
    String name;
    int roll;

    Employee(Student s) {
        this.name = s.name;
        this.roll = s.roll;
    }
}

public class Generics {
    public static void main(String[] args) {
        Student s = new Student("souchik", 102);
        Student s1 = new Student("Joardar", 2023);
        Employee e = new Employee(s);
        Employee e1 = new Employee(s1);
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s);
        al.add(s1);
        System.out.println(al);
        // al.add(e); //cannot insert an employee type of object
        // Generics ensure that type safety is enforced in a collection since they're
        // dynamic and heterogenous in nature
    }
}
