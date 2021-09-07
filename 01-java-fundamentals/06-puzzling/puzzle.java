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

    public void roll(){
         ArrayList<Integer> arr = new ArrayList<Integer>();
         int i=0;
         for (1<10; i++;){
             arr.add(rand,nextInt(20));
         }
         system.out.println(arr);
    }

    public String setpass(int num){
        ArrayList<String> pass = new ArrayList<String();
        int i = 0;
        for (i< num; i++){
            pass = pass + random();
        }
        return pass;
    }
}