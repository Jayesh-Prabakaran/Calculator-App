import java.util.Scanner;

public class Main
{
    public static void sum(int val1, int val2)
    {
        System.out.println(val1+" + "+val2+" = "+(val1+val2));
    }

    public static void difference(int val1, int val2)
    {
        System.out.println(val1+" - "+val2+" = "+Math.abs(val1-val2));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO THE CALCULATOR APP!");

        System.out.println("Enter value 1: ");
        int val1 = sc.nextInt();

        System.out.println("Enter value 2: ");
        int val2 = sc.nextInt();

        sum(val1, val2);
        difference(val1, val2);

        System.out.println("New Change");
    }
}
