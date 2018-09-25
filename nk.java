import java.util.Scanner;
class NKN
{
public static void main(String[] args)
{
     int n,k;
       int[] sr; 
     int sum=0;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     k=s.nextInt();
     sr = new int[n];
     for(int i=0;i<n;i++)
     {
     	sr[i]=s.nextInt();
     }
     
     for(int i=0;i<k;i++)
     {
     	sum=sum+sr[i];
     }
     System.out.println(+sum);
     }
}

