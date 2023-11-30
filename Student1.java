/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Student1;

/**
 *
 * @author tiwar
 */
import java.util.Scanner;
    class Student1 {
    final int id;
    final String name;
    final int[] grades;
    private double average;
    private int highest;
    private int lowest;

    public Student1(int id, String name, int[] grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public void computeAverage() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        average = sum / grades.length;
    }

    public void computeHighest() {
        highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
    }

    public void computeLowest() {
        lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.print("Grades: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
        System.out.println("Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        System.out.println("Enter the number of grades");
        int n= scanner.nextInt();
        Student1 students[]= new Student1[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) +  ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Grades : ");
            int[] grades = new int[n];
            for (int j = 0; j < grades.length; j++) {
                grades[j] = scanner.nextInt();
            }
            students[i] = new Student1(id, name, grades);
            students[i].computeAverage();
            students[i].computeHighest();
            students[i].computeLowest();
        }

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Details for student " + (i + 1) + ":");
            students[i].printDetails();
        }
    }
}
  
