package com.kodilla.kodilaintro;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        User user = new User();

        Scanner input = new Scanner(System.in);

        for (int i=0; i < user.averageOfAges; i++) {
            System.out.println("Wprowadz wiek "+(i+1));
            int grade = input.nextInt();
            user.add(value);
        }
        System.out.println("Srednia ocen" + user.averageOfAges());

//public class Main{
//    public static void main(String[] args) {
//        Grades grades = new Grades();
//
//        Scanner input = new Scanner(System.in);
//
//        for (int i=0; i < 10; i++) {
//            System.out.println("Wprowadz liczbe "+(i+1));
//            int grade = input.nextInt();
//            grades.add(grade);
//        }
//        System.out.println("Ostatnia ocena" + grades.theLastOne());
//        System.out.println("Srednia ocen" + grades.averageOfGrades());
//
//    }
//}
//    public static void main(String[] args) {
//        String myName = "Maciej";
//        System.out.println(myName);
//        int myAge = 22;
//        System.out.println(myAge);
//        double height = 1.78;
//        System.out.println(height);
//        char carClass = 'A';
//        System.out.println(carClass);
//        boolean isGoodProgrammer = true;
//        System.out.println(isGoodProgrammer);


