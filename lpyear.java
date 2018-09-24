import java.util.Scanner;
public class Main
{
  public static void main(String[] args) 
{
    int a;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    if (a%4==0)
    {
      System.out.println("yes");
    }
    else
    {
      System.out.println("no");
    }
  }
}
