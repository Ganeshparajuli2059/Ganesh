/*Two numbers are entered through the keyboard. Write a program to find  the value of one number raised to the power of another. (Do not use Java  built-in method) [Home Task]  */
import java.util.Scanner;
public class PPower{
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter base number");
       int n1 = sc.nextInt();
       System.out.println("Enter power to be raised");
       int n2=sc.nextInt();
       int mult=1;
       for(int count=1; count<=n2; count++){
           mult=mult*n1;//The answer is multiplied till the power is reached.
       }
       System.out.println(n1+"to the power of "+n2+"="+mult);
    }
}