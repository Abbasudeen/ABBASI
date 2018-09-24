import java.util.Scanner;
public class Postive_Negative 
{
    public static void main(String[] args) 
    {
        int g;
        Scanner s = new Scanner(System.in);
        System.out.print("");
        g = s.nextInt();
        if(g > 0)
        {
            System.out.println("Positive");
        }
        else if(g < 0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }
    }
}
