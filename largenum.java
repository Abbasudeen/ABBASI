import java.util.Scanner;
public class largenum
{
  public static void main(String[] args) 
{
    int a,b,c;
    Scanner s=new Scanner(System.in);
    System.out.println("");
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    if (a>b&&a>c)
    {
      System.out.println(a);
    }
    else if(b>a&&b>c)
    {
      System.out.println(b);
    }
    else
    {
      System.out.println(c);
    }
  }
}
