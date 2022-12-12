//2. Write a program to compute the cosine of x. The user should supply x and a positive integer n. 
//We compute the cosine of x using the series and the computation should use all terms in 
//the series up through the term involving xn cos x = 1 - x2/2! + x4/4! - x6/6! ..... [Home Task]

import java.util.Scanner;
public class Sin{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of x");
        int x= sc.nextInt();
        double pi= 3.14;
        double y= (x*3.14)/180;
        int sign=1, fact=1;
        double cos=1;
        double power=1;
        for(int i=1; i<=5; i++){//runs 5times
            sign=sign*-1;//add -1 alternatively
            fact= fact*(2*i-1)*(2-i);//since eg; 4!=2!*3*4
            power= power*y*y;
            cos=cos+(sign*power)/fact;
    }
    System.out.println(" The cosine of " +x+ " is " +y);
}
}