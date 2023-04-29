import java.util.*;
public class Sum
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
int a,b,c;
char ch;
do
{
System.out.println("Enter first num");
a=s.nextInt();
System.out.println("Enter first num");
b=s.nextInt();
c=a+b;
System.out.println("Sum of 2 numbers" + c);			
System.out.print("Do you want to continue y/n? ");
ch = s.next().charAt(0);			
System.out.println();
}
while(ch=='y' || ch=='Y');             
}
}
