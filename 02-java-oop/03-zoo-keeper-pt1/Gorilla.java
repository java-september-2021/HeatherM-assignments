public class Gorilla extends ZooKeeper{
    public Gorilla(){
        super(100, "Gorilla");
    }

    public void eatBanana(){
        energy +=10;
        System.out.println(this.energy);
    }
    public void throwbanana(){
        energy -=5;
        System.out.println(this.energy);
    }
    public void climb(){
        energy -=10;
        System.out.println(this.energy);
    }
}