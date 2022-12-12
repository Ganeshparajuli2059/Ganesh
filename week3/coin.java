import java.util.Scanner;
public class coin{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the money");
        int money=sc.nextInt();
        System.out.println("change "+ "  50p " + "  20p " + "  10p " + "  5p " + "  1p ");
        while(money>0){
            int fifties= money/50; // check if remainder is divided by 50p coins.
            int rest= money%50;
            int twenties= rest/20;//check if remmainder is divided by 20p coins
            int rest2= rest%20;
            int tens= rest2/10; //check if remainder is divided by 10p coins
            int rest3= rest2%10;
            int fives=rest3/5;//check if remainder is divided by 5p coins
            int rest4=rest3%5; 
            int twos=rest4/2; //check if reminder is divided by 2p coins
            int rest5=rest4%2;
            int ones=rest5; //check if money is remainder is divided by 1p coins
            System.out.println(money+ "     " +fifties+ "   " +twenties+ "     " + tens+ "     " +fives+ "      " +twos+ "     " +ones);
            money = sc.nextInt();
            if(money<=0){//since money cant be negative so its used for end.
                break;
            }
            
            
            
        }
        System.out.println(" Programmed stop due to immeserable value.");
        
    }
}