import java.util.Scanner;
public class Totalsum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number= sc.nextInt();
        int sum=0;
        while(number>=1){
            sum=number+sum;
            System.out.println("Enter number");
            number=sc.nextInt();
    }
    System.out.println("sum " +sum);
}
}