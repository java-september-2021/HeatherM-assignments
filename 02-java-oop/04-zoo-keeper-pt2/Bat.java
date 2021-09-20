public class Bat extends ZooKeeper {
    private String sound = "Fire";
    private int energy = 300; 

    public Bat(){
        super(300, "Bat");
    }
    public void fly(){
        energy -=50;
        System.out.println("woosh! take off!" + this.energy);
    }

    public void eatHumans(){
        energy +=25;
        System.out.println("Eating Hunmans : " + this.energy);
    }
     public void attackTown(){
        energy -=100;
        System.out.println("attacking town: " + this.sound + this.energy);
    }
}