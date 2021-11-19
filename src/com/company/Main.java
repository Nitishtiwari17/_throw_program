package com.company;
import java.util.Scanner;
 class YoungAgeException extends RuntimeException{
     YoungAgeException(String msg)
     {
         super(msg);
     }
 }
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
        if(age<18)
        {
            throw new YoungAgeException("your are not eligible for voting");
        }
        else
        {
            System.out.println("you are eligible for voting");
        }
	// write your code here
    }
}
