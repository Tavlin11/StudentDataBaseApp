package studentdatabaseapp;

import java.util.Scanner;

/**
 *
 * @author tavlin
 */
public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt to enter student name or year 
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student First Name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter Student Last Name: ");
        this.lastName = in.nextLine();

        System.out.print("1. Freshmen,\n2. Sophmore\n3. Junior\n4. Senior\nEnter Student Class Level : ");
        this.gradeYear = in.nextInt();

        setStudentID();

    }

    //Generate an id
    private void setStudentID() {
        // grade level
        id++;
        this.studentId = gradeYear + "" + id;
    }

    //enroll in courses
    public void enroll() {
        //get inside a loop user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);

    }

    //view balance
    public void viewBalance() {
        System.out.println("Your Balance is: $" + tuitionBalance);
    }

    //pay tuition 
    public void payTuition() {
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    //show status
    public String toString() {
        return "\nName: " + firstName + " " + lastName
                + "\nGrade level: " + gradeYear
                + "\nStudent Id: " + studentId
                + "\nCourses Enrolled:" + courses
                + "\nBalance: $" + tuitionBalance;

    }
}
