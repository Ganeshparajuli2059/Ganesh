public class Pyramidnumber{
    public static void main (String[]args){
        int last=1;
        int start=5; 
        for(int i=1; i<=(last-5+1); ++i){
            for(int j = 2; j<=i; ++j){
                System.out.print(start + " ");
        }
        ++start;
        System.out.println();
    }
}
}