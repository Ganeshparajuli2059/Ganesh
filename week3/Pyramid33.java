import java.util.Scanner;
public class Pyramid33{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int b=0;
    for(int i=1;i<=n;i++,b=0){
        //new row
        for(int c=1;c<=n-i;c++){//add space in pattern
        System.out.print(" ");
            
        }
        for(int d=i;d>=1;d--){//reduce value by 1
            System.out.print(d);
        }
        for(int d=1; d<=i; d++){//increase value by 1
            if(d==1){
                continue;// skip second 1 
            }
            System.out.print(d);
    }
    System.out.println();//Create new line for new row
}
}
}