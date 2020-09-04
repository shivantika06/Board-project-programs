import java.util.Scanner;
public class pattern
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner (System.in);
        System.out.println ("How many rows you want?");
        int rows= sc.nextInt();
        int i;
        i=0;
        System.out.println();
        // loop for rows
        for (i= 1; i<=rows; i++);
        {
            for (int j= 1; j<=(rows-i) +1; j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}