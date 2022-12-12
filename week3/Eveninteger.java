import java.util.Scanner;
public class Eveninteger{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number= sc.nextInt();
        while(number%2==1){
            System.out.println("Please try again");
            System.out.println("Enter another even integer");
            number = sc.nextInt();
    }
    System.out.println("Okay ");
}
}