/*      8b   
              1
             222 
            33333 
           4444444 
         555555555  */
import java.util.Scanner;
public class Pyramid2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Maximum number for pattern.");
        int num=sc.nextInt();
        int n=0;
        for(int i =1; i<=num;i++, n=0){
            //for row value
            for(int k=1;k<=num-i; k++){
                System.out.print(" ");//give space
            }
            while(n!=2*i-1){
                //fixes number of values in a row
                System.out.print(i); //adds value
                n++;
                
            }
            System.out.println();
        }
    }

}