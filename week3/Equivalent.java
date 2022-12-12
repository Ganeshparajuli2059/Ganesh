/*3. Write an equivalent while() loop for the following for() loop*/
public class Equivalent{
    public static void main(String[]args){
        int s=0;
        for( int x=1; x<=25; x+=2)
        s+=x;
        System.out.println("The sum is " + s);
    }
}