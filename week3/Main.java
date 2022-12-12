public class Main { 
public static void main(String[] args) { 
int num; 
int product = 1; 
String a = System.console().readLine("Enter first number"); 
num = Integer.parseInt(a); 
while (num != 0) { 
product = product * num; 
a = System.console().readLine("Enter first number"); 
num = Integer.parseInt(a); 
} 
System.out.printf("product = %d", product); 
} 
}
