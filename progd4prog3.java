import java.util.Scanner;
class Test4
{
public static void main(String args[])

Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
int res=i-j;
if(i<j)
{
System.out.println(j-i);
}
else
{
System.out.println(i-j);
}
}
}