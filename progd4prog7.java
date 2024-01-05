//JAVA PROGRAM TO ILLUSTRATE UNARY NOT OPERATOR
import java.util.Scanner;
class Unarynotoperator2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
//displaying values stored in above variables
System.out.println("Var1="+a);
System.out.println("Var2="+b);
//displaying values stored in above variables
//after applying unary NOT operator
System.out.println("!(a<b)="+!(a<b));
System.out.println("!(a>b)="+!(a>b));
}
}