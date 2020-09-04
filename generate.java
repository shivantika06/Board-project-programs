import java.util.Random;
public class generate
{
    /**
     * to generate 20 unique random numbers
     */
    public static void main (String args[])
    {
        Random randomnumgenerator = new Random();
        for (int idx = 1; idx <= 20; ++idx)
        {
            int randomInt = randomnumgenerator.nextInt(100);
            System.out.println ("Random Number=" +randomInt);
        }
    }
}  
