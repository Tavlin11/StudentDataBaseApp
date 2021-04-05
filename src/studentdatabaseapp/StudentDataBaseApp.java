package studentdatabaseapp;

import java.util.Scanner;

/**
 *
 * @author tavlin
 */
public class StudentDataBaseApp {

    public static void main(String[] args) {

        //Ask how many users to add
        System.out.print("Enetr number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] studnets = new Student[numOfStudents];

        //Create n number of new studentes
        for (int i = 0; i < numOfStudents; i++) {
            studnets[i] = new Student();
            studnets[i].enroll();
            studnets[i].payTuition();
            System.out.println(studnets[i].toString());
        }

    }

}
