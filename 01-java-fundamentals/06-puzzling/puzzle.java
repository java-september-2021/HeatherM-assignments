import java.util.Random;
import java.util.ArrayList;
public class puzzle{
    Random rand = new Random();
    
    public class void random(){
        ArrayList<Character> letters = new ArrayList<Charachter> ();
        Char letter = 'A';
        for (letter<= 'Z'; ++letter;){
            letters.add(letter);
        }
        int index = rand.nextInt(26);
        char l = letters.get(index);
        return l;
    }
}