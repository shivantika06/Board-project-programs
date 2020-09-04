import java.util.*;
public class result
{
    public static void main (String args[])
    {
        int n, avg = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = in.nextInt();
        int names[] = new int[n];
        int rollnumber[] = new int[n];
        int sub1[] = new int[n];
        int sub2[] = new int[n];
        int sub3[] = new int[n];
        int i=0;        
        for (i=0; i<n;i++);
        {
            System.out.println ("Enter the name ");
            names[i]= in.nextInt();
            System.out.println ("Enter the roll number");
            rollnumber[i]= in.nextInt();
            System.out.println ("Enter the first subject marks");
            sub1[i]= in.nextInt();
            System.out.println ("Enter the second subject marks");
            sub2[i]= in.nextInt();
            System.out.println ("Enter the third subject marks");
            sub3[i]= in.nextInt();
            int total= sub1[i] + sub2[i] + sub3[i];
            avg= total/3;
            if (avg>+85&&avg<=100)
            System.out.println("Excellent");
            if (avg>=75&&avg<84)
            System.out.println ("Distinction");
            if (avg>=65&&avg<75)
            System.out.println ("First class");
            if (avg>=40&&avg<65)
            System.out.println ("Pass");
            if (avg<40)
            System.out.println ("Poor");
        }
    }
}