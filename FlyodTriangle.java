import java.util.Scanner;
//import the scanner class
public class FlyodTriangle

{
public static void main (String args[])
{
Scanner cmd = new Scanner (System.in);
    int rows= cmd.nextInt();
    printFloydtriangle (rows);
}
/**
 * Print Floyd's triangle of a given row
*/
private static void printFloydtriangle(int rows)
{
        int n ;
        int i,j ;
        n=1;
        System.out.printf("Floyd's triangle of %d rows is: %n", rows);
        for ( i = 1 ; i <= rows ; i++ )
       {
           for ( j = 1 ; j <= i ; j++ )
           {
                System.out.print(n+" ");
                //Incrementing the number value
                n++;
           }
           //For new line
           System.out.println();
       }
    }
}
