/*Group c 1.(d) Prompts the user to enter any number of positive and negative integer 
values, then
Displays the number of each type that were entered. [HomeTask]*/
import java.util.Scanner;
public class numberidentifier{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number= sc.nextInt();
        if(number>=0){
    System.out.println("The number  " +number + " is Poitive number");
}
else if(number<=0){
    System.out.println("The number  "  + number +" is negative number");
}
}
}