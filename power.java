import java.util.Scanner;
public class Power
{
  public static void main(String[] args) 
  {
      int a,b,g=1;
      Scanner s=new Scanner (System.in);
      a=s.nextInt();
      b=s.nextInt();
     {
         for(int i=1;i<=b;i++)
	      {
            g=g*a;
 	      }	    
     }
    System.out.println(g);
  } 
}
