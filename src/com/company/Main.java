package com.company;

import model.Person;
import model.Triangle;
import validator.Validator;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Validator validator = new Validator();
//        String firstName;
//        String lastName;
//        String passportId;
//        int age;
//        String gender;
//        String nationality;
//
//        while (true){
//            System.out.print("Enter firstname range(3 - 15): ");
//            firstName = sc.nextLine();
//            if(validator.isFirstnameRange(firstName)){
//                break;
//            }else{
//                System.out.print("Invalid firstname");
//            }
//        }
//
//        while (true){
//            System.out.print("Enter lastname range(6 - 21): ");
//            lastName = sc.nextLine();
//            if(validator.isLastnameRange(lastName)){
//                break;
//            }else{
//                System.out.print("Invalid lastname");
//            }
//        }
//        sc.nextLine();
//
//        while (true){
//            System.out.print("Enter age range(18 - 99): ");
//            age = sc.nextInt();
//            if(validator.isAgeRange(age)){
//                break;
//            }else{
//                System.out.print("Invalid age");
//            }
//        }
//
//        while (true) {
//            System.out.println("Enter gender : ");
//            gender = sc.nextLine();
//            if (validator.isGander(gender)) {
//                break;
//            } else {
//                System.out.println("Invalid gender");
//            }
//        }
//        while (true) {
//            System.out.println("Enter passportId : ");
//            passportId = sc.nextLine();
//            if (validator.isPassportId(passportId)) {
//                break;
//            } else {
//                System.out.println("Invalid passportID");
//            }
//        }
//
//        System.out.println("Enter nationality");
//        nationality = sc.nextLine();
//
//
//        Person person =new Person(firstName,lastName,passportId,age,gender,nationality);
//        person.display();


//        int sideA;
//        int sideB;
//        int sideC;
//
//        while (true) {
//            System.out.println("Enter sideA range(1-20): ");
//            sideA = sc.nextInt();
//            if (validator.isTriangleSide(sideA)) {
//                break;
//            } else {
//                System.out.println("Invalid sideA");
//            }
//        }
//
//        while (true) {
//            System.out.println("Enter sideB range(1-20): ");
//            sideB = sc.nextInt();
//            if (validator.isTriangleSide(sideB)) {
//                break;
//            } else {
//                System.out.println("Invalid sideB");
//            }
//        }
//
//        while (true) {
//            System.out.println("Enter sideC range(1-20): ");
//            sideC = sc.nextInt();
//            if (validator.isTriangleSide(sideC)) {
//                break;
//            } else {
//                System.out.println("Invalid sideC");
//            }
//        }
//
//        Triangle triangle = new Triangle(sideA, sideB, sideC);
//        if (!validator.check(triangle)) {
//            System.out.println("Triangle is not valid");
//            return;
//        }
//
//        if (validator.isRightTriangle(triangle)) {
//            System.out.println("Triangle is right triangle");
//        }
//
//        System.out.println("Area triangle : " + triangle.area());


        








    }
}
