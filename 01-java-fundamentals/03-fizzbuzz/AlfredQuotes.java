import java.util.Date; 
public class AlfredQuotes{
    public void greeting (String name){
        System.out.println("Hello " + name + " Nice to meet you!");
    }
    public void greeting2 (String name, String dayPeriod){
        System.out.println("Good " + dayPeriod +  name);
    }
    public String date(String name){
        Date date = new Date();
        System.out.println("The Current date is : " + date);
        return "Hello, " + name + " The current date is : " + date;
    }
    public String AlfredIsBetter(String responses){
        int alexis = responses.indexOf("Alexis");
        int alfred = responses.indexOf ("Alfred");

        if (alexis != -1){
                responses = "Of course sir, alexis doesn't listen.";
        } else if(alfred != -1) {
            responses ="Right away sir!";
        } else{
            responses="Goodnight then sir.";
        }
        System.out.println(responses);
        return responses;



    }


}
