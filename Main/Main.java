import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("WELCOME TO THE CALCULATOR APP!");

        System.out.println("Enter value 1: ");
        int val1=sc.nextInt();

        System.out.println("Enter value 2: ");
        int val2=sc.nextInt();
        
        sum(val2, val1);
        difference(val1, val2);
    }
}
