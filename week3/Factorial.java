/*4. Write a program to find the factorial value of any number entered through  the keyboard.*/
import java.util.Scanner;
public class Factorial{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = sc.nextInt();
        int i =1;
        while(number>=1){
            i=i*number;
            number= number-1;
        }
        System.out.println(i);
        
    }
}