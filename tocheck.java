import java.util.*;
public class tocheck
{
public static void main (String str, char ch)
{
    int c= 0;
    for (int j=0; j<str.length(); j++)
    {
        char ch2= str.charAt(j);
        if (ch==ch2)
        c++;
    }
    if (c!=0)
    {
        System.out.println ("Number of "+ch+" present is " +c);
    }
}
void check (String s1)
{
    String s= s1.toLowerCase();
    System.out.println("Vowels are");
    for (int i=0; i<s.length(); i++)
    {
        char ch= s.charAt(i);
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        System.out.println(ch+" ");
    }
}
}