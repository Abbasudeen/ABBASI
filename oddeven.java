import java.util.Scanner;
public class Oddeven
{
public static void main(String args[])
{
int x;
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
if(x%2==0)
{
System.out.println("Even");
}
else if(x%2==1)
{
System.out.println("Odd");
}
  else
  {
    System.out.println("Invalid");
  }
}
}
