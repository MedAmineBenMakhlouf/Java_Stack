import java.util.Random;
import java.util.ArrayList;

    


public class PuzzleJava{
    ArrayList<Integer> list = new ArrayList<Integer>();
    Random rand = new Random();
    public void getTenRolls()
    {
        for(var i =0 ;i<10;i++)
        {
            list.add(i, rand.nextInt(20));
        }
        System.out.println(list);
    }
    
    public void getRandomLetter()
    {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int randomIndex = rand.nextInt(26);
        System.out.println(alphabet[randomIndex]);
    }
    
    public void generatePassword()
    {
        String password ="";
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
        for(var i =0 ;i<8;i++)
        {
            int randomIndex = rand.nextInt(26);
            password = password + alphabet[randomIndex];
        }
        System.out.println(password);
    }
    public void generatePassword(int len)
    {
        String password ="";
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
        for(var i =0 ;i<len;i++)
        {
            int randomIndex = rand.nextInt(26);
            password = password + alphabet[randomIndex];
        }
        System.out.println(password);
    }
}