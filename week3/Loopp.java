import java.util.*;
public class Loopp{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number between 0-200");
        int num=sc.nextInt();
        int suma=0, sumb=0;
        while (num>=0 && num<=200){
            //check input is between 0-200
            while(num>=0 && num<=200){//check whether number is between 0-100
                suma=suma+num;
                System.out.println("Enter another number.Enter negative number to stop.");
                num=sc.nextInt();
        }
        while(num>100 && num<200){
            if(num%2==0){
                sumb=sumb+num;//Sum even betn 100-200
                System.out.println("Enter another number or negative number to stop");
                num=sc.nextInt();
                if(num%2==1){//breaks the loop if value is odd
                    break;
                    
                }
            }
            System.out.println("Enter even number or negtaive number to stop");
            num=sc.nextInt();
            if(num<0 && num>200){//breaks the loop is value is lesser than 100 or greater than 200.
              break;  
            }
        }
    }
    System.out.println("Sum of positive integer less than 100 is : " +suma);
    System.out.println("Sum of even number between 100 to 200 is : " +sumb);
}
}