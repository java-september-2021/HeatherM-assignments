public class ZooKeeperTester{
    public static void main (String[] args){
        ZooKeeper monkey = new ZooKeeper(100, "Monkey");
        System.out.println(monkey.energy);
        monkey.displayEnergy();
        monkey.loseEnergy("throw banana");
    }
}