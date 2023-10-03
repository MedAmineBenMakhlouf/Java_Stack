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
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        for(var i =0 ;i<len;i++)
        {
            int randomIndex = rand.nextInt(26);
            password = password + alphabet[randomIndex];
        }
        System.out.println(password);
    }

    public void shuffleArray(int[] arr)
    {
        int firstIndex = 0;
        int secondIndex=0;
        for(var i=0;i<arr.length;i++)
        {
            firstIndex = rand.nextInt(arr.length);
            secondIndex = rand.nextInt(arr.length);
            int aux = arr[firstIndex];
            arr[firstIndex] = arr[secondIndex];
            arr[secondIndex] = aux;
        }
        for(var i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}