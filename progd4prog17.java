import java.util.Scanner;
class Test6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
if((c<'a' || c<'z') && (c>'A' || c>'Z'))
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}