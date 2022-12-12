/* 7. Write a program to print the Fibonacci series of n terms where n is input by  user:  
0 1 1 2 3 5 8 13 24 ..... */

class Fibonacci{  
public static void main(String args[])  
{    
 int n1=0,n2=1,n3=1,n4=2,n5=3,n6=5,n7=8,n8=13,n9=24,n10,i,count=10;    
 System.out.print(n1+" "+n2);   
    
 for(i=2;i<count;++i) 
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  