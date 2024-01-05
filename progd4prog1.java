//ADDITION OPERATOR
import java.util.Scanner;
class Additionoperator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
int res=i+j;
int res1=i/j;
if( res1==0)
{
System.out.println("Division by zero");
}
else
{
System.out.println("Infinity");
}
System.out.println(i + "+" +j+ "=" +res);
System.out.println(i + "/" +j+ "=" +res1);
}
}