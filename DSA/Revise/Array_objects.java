package Revise;

import java.util.*;

class Student {
    int roll_number;
    String name;
    double marks;

    Student(String name, int roll_number, double marks) {
        this.roll_number = roll_number;
        this.name = name;
        this.marks = marks;
    }
}

public class Array_objects {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[3];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the " + i + "th students records name, roll_number, marks");
            String name = in.next();
            int roll = in.nextInt();
            double marks = in.nextInt();
            students[i] = new Student(name, roll, marks);
        }
        for (int i = 0; i < students.length; i++) {
            System.out.print("\n The student's name is: " + students[i].name + " , roll number:  "
                    + students[i].roll_number + " , marks is: " + students[i].marks);
        }
        in.close();
    }
}
