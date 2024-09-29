public class Pkg {
    String sender;
    String rece;
    int weight;
    int cost;

    Pkg(){

    }
    public Pkg(String sender, String rece, int weight, int cost) {
        this.sender = sender;
        this.rece = rece;
        this.weight = weight;
        this.cost = cost;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRece() {
        return rece;
    }

    public void setRece(String rece) {
        this.rece = rece;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double calCost(){
        return (weight*cost);
    }
}
class TwoDay extends Pkg {
    int flatFlee;
    TwoDay(){

    }

    public TwoDay(int flatFlee) {
        this.flatFlee = flatFlee;
    }

    public TwoDay(String sender, String rece, int weight, int cost, int flatFlee) {
        super(sender, rece, weight, cost);
        this.flatFlee = flatFlee;
    }

    public int getFlatFlee() {
        return flatFlee;
    }

    public void setFlatFlee(int flatFlee) {
        this.flatFlee = flatFlee;
    }

    @Override
    public double calCost() {
        return super.calCost() + flatFlee;
    }
}

class overnight extends Pkg {
    int charges;
    overnight(){

    }

    public overnight(int flatFlee) {
        this.charges = flatFlee;
    }

    public overnight(String sender, String rece, int weight, int cost, int flatFlee) {
        super(sender, rece, weight, cost);
        this.charges = flatFlee;
    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }

    @Override
    public double calCost() {
        return super.calCost() + charges;
    }
}



class checkPkg{
    public static void main(String[] args) {
        TwoDay d = new TwoDay("m","u",12,12,100);
        overnight n = new overnight("m","u",12,12,100);

        Pkg p[] = new Pkg[2];
        p[0] = d;
        p[1] = n;

        for(int i = 0;i<2;i++){
            System.out.println(p[i].calCost());
        }

    }
}