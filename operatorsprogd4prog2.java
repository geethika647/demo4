//SUBSTRACTION 
import java.util.Scanner;
class Arithematicoperators
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double num1=sc.nextDouble();
double num2=sc.nextDouble();
double res=num1+num2;
double res1=num1-num2;
double res2=num1*num2;
double res3=num1/num2;
double res4=num1%num2;
System.out.println("The sum of res is:"+num1+  "+"   +num2+ "=" +res);
System.out.println("The difference between two numbers is:"+num1+  "-"   +num2+  "=" +res);
System.out.println("The product of res1 is:"+num1+  "*"  +num2+  "=" +res1);
System.out.println("The division of res2 is:"+num1+  "/"  +num2+  "=" +res2);
System.out.println("The quotient of res3 is:"+num1+  "%" +num2+  "=" +res3);
}
}
