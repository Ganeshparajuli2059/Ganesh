/*6. Write a program to enter the numbers till the user wants and at the end it  should display the count of positive, negative and zeros entered. */
import java.util.Scanner;
public class Infinity{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int count1=0, count2=0, count3=0; //It record counter of number entered
        for(int i=1;i<=n1;i++){
            //takes input from user
            System.out.println("Enter number");
            int n2=sc.nextInt();
            if(n2>0){
                //Check Positive numberr.
                count1=count1+1;
            }
            else if (n2<0){
                //Check negative number
                count2=count2+1;
            }
            else if (n2==0){
                //check zero
                count3=count3+1;
            }
            System.out.println("Total Positive number entered: " + count1);
            System.out.println("Total negative number entered: " + count2);
            System.out.println("Total zero number entered: " + count3);
        }
    }
}