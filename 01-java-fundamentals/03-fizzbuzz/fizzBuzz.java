public class fizzBuzz{
     public void count(){
        for (int i= 1; i <= 100; i++){
            String result = fizzBuzz(i);
            System.out.printf("Number: %d Result is %s", i, result);


        }
    }

    public String fizzBuzz (int val){
        if(val % 3 == 0 && vall % 5 == 0){
            return "fizbuzz";
        
        } else if (val % 3 == 0){
            return ("fizz")
        }else if ( val % 5 == 0){
            return "Buzz"
        
        } else {
            return Integer.toString (val)
        }
    }
}
