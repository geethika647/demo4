import java.util.Scanner;
class Test5
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("enter first number:");
int num1=scan.nextInt();
System.out.println("enter second number:");
int num2=scan.nextInt();
System.out.println("enter third number:");
int num3=scan.nextInt();
if((num1>num2)  && (num1>num3))
{
System.out.println("the greatest number is:"+num1);
}
if((num2>num1)&& (num2>num3))
{
System.out.println("the greatest number is:"+num2);
}
else
{
System.out.println("the greatest number is:"+num3);
}
}
}

