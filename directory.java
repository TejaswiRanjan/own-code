/*
 Write a program that takes input your name and print your details using swith case and if the details are not present with that name then print the details are not present with that name
 */

import java.util.Scanner;

public class directory {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the name : ");
        String name = scan.nextLine();

        switch (name) {
            case "Tejaswi":
                System.out.println("Name : " + name);
                System.out.println("phone no : 7667736514");
                System.out.println("Address : Rajdhanwar (Giridih) jharkhand");
                break;
            case "Prakash":
                System.out.println("Name : " + name);
                System.out.println("phone no :  9304372165");
                System.out.println("Address : Ghorthamba (Giridih) Jharkahnd ");
                break;
            case "Shubham":
                System.out.println("Name : " + name);
                System.out.println("phone no :  7488088834");
                System.out.println("Address : Hazaribagh (Giridih) Jharkhand");
                break;
            case "Himanshu":
                System.out.println("Name : " + name);
                System.out.println("phone no :  6202005784");
                System.out.println("Address : Orangabad Bihar");
                break;
            default:
                System.out.println("The Details is not present with this name : " + name);

        }
    }
}