import java.util.Scanner;
public class Interest
{    public static void main (String args[])
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Menu");
        System.out.println ("1. Term Deposit");
        System.out.println ("2. Recurring Deposit");
        System.out.println ("Enter your choice:");
        int choice = scanner.nextInt();
        switch (choice)
        {
            case 1:
            System.out.print ("Enter principal: ");
            int P1 = scanner.nextInt();
            System.out.print ("Enter rate of Interest: ");
            int r1 = scanner.nextInt();
            System.out.print ("Enter period in years: ");
            int n1 = scanner.nextInt();
            double maturityamount1 = P1 * Math.pow(1 + r1 / 100.0, n1);
            System.out.println ("Maturity Amount  is " + maturityamount1);
            break;
            case 2 :
            System.out.print ("Enter monthly installment: ");
            int P2 = scanner.nextInt ();
            System.out.print ("Enter rate of interest: ");
            int r2 = scanner.nextInt();
            System.out.print ("Enter period in months: ");
            int n2 = scanner.nextInt();
            double maturityamount2 = P2 * n2 + P2 * (n2 * ((n2 + 1) / 2.0) * (r2 / 100.0) * (1.0 / 12)) ;
            System.out.println ("Maturity Amount is " + maturityamount2);
            break;
            case 3:
            System.out.println ("Invalid Choice");
        }
    }
}

