import java.util.Scanner;
public class PalindromeEx
{  
 public static void main(String args[]) 
      {
        int ans=0,temp,x,input;
        System.out.println("");
        Scanner sc=new Scanner(System.in);
        input=sc.nextInt();
        temp=input;
        while(input>0)
          {
            x=input%10;
            ans=ans*10+x;
            input=input/10;
          }
          
        if(ans==temp)
          {
          System.out.println("yes");
          }
        else
          {
          System.out.println("no");
          }
     }
}
    
