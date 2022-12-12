import java.util.Scanner;
public class Add{
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Value");
    double A= sc.nextDouble();
    System.out.println("Enter another value");
    double B= sc.nextDouble();
    double Add = A+B;
    System.out.println("Sum of a number is "  + Add);
}
}
