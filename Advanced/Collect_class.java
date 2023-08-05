import java.util.*;

class Person {
    int addhar;
    String address;

    public int getAddhar() {
        return addhar;
    }

    public String getAddress() {
        return address;
    }

}

class Student extends Person {
    int marks;
    String name;
    int age;

    public Student(int marks, String name, int age) {
        this.age = age;
        this.marks = marks;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return (String) name;
    }

    // inorder to return a structured output wihle returning an object instead of
    // getting hashcodes we need to override the toString() which present in teh
    // object class which is the parent of all classes
    public String toString() {
        return "" + marks + "" + age + "" + name;
    }
}

public class Collect_class {
    public static void main(String[] args) {
        Student s = new Student(91, "Souchik", 22);
        Student s1 = new Student(40, "ritam", 24);
        Student s2 = new Student(60, "pritam", 25);
        ArrayList<Student> a = new ArrayList<Student>();
        a.add(s);
        a.add(s1);
        a.add(s2);
        System.out.println(a);
        s.toString();
        // System.out.println(s1.getAge());
        s1.getAge();
    }

}
