import java.util.Scanner;
public class ProfitLoss{
public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Selling Price");
    double sP = sc.nextDouble();
    System.out.println("Enter the Cost Price");
    double cP = sc.nextDouble();
    double profitp, lossp;
    profitp = (sP-cP)/cP*100;
    lossp =(cP-sP)/cP*100;
    if (sP>cP){
    System.out.println("The Profit Percentage is " + profitp + "%");
    } else if (cP>sP) {
    System.out.println("The Loss Percentage is " + lossp + "%");
    } else {
    System.out.println("Neither Profit nor Loss");
    }
}
}
    