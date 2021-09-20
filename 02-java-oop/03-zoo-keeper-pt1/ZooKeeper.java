public class ZooKeeper{
   public String type;
    public int energy =100;

    public ZooKeeper(int energy, String type){

        this.type = type;
        this.energy = energy;

    }

    public void setType(String type){

        this.type = type;

    }
    public String getType(){

        return this.type;

    }
    public void setEnergy(int energy){

        this.energy = energy; 

    }

    public int getEnergy(){
        return this.energy;
    }

    public int displayEnergy(){
        System.out.println(this.energy);
          return this.energy;
    }

   

}



