/* 6. Write a program to enter the numbers till the user wants and at the end it  should display the count of positive, negative, and zeros entered. */

import java.util.Scanner;
public class Postiveinteger{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number= sc.nextInt();
        int sum =0;
        while(number>=0){
            sum=sum+number;
            System.out.println("Enter another positive integer");
            number = sc.nextInt();
    }
    System.out.println("The sum is " +sum);
}
}