import java.util.Set;
public class hashMap {
    public static void main(String[] args) {
        HashMap<String, String> songMap = new HashMap<String, String>();
        songMap.put("Hey Jude" , "Hey Jude, don't make it bad.");
        songMap.put("Here Comes The Sun", "Here Comes The Sun, Do Do Do Do ");
        songMap.put("Obladi Oblada", "Desmond has a barrow in the market place");
        songMap.put("Yellow Submarine", "We all live in a yelloqw submarine");

        String Track = songMap.get("Hey Jude");
        System.out.println("Track name is " + Track);

        Set<String> key = songMap.keySet();
        for (String key: keys){
            System.out.println(key);
            System.out.println(songMap.get(key));
        }
    }
}