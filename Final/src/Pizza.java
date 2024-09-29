public class Pizza {
    String size;
    int cheese;
    int peppori;
    int ham;
    Pizza
            (){

    }

    public Pizza(String size, int cheese, int peppori, int ham) {
        this.size = size;
        this.cheese = cheese;
        this.peppori = peppori;
        this.ham = ham;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getPeppori() {
        return peppori;
    }

    public void setPeppori(int peppori) {
        this.peppori = peppori;
    }

    public int getHam() {
        return ham;
    }

    public void setHam(int ham) {
        this.ham = ham;
    }

    public int calCost(){
        if(size.equals("small")){
            return (10 + (2*cheese) + (2  * peppori) + (2*ham));
        }
        else if(size.equals("Large")){
            return (14 + (2*cheese) + (2  * peppori) + (2*ham));
        }
        else{
            return (12 + (2*cheese) + (2  * peppori) + (2*ham));
        }
    }

    public void description(){
        System.out.println(size);
        System.out.println(calCost());
    }
}

class d{
    public static void main(String[] args) {
        Pizza p =new Pizza("Large",1,1,2);
        Pizza p1 =new Pizza("Large",1,1,2);
        System.out.println(p.calCost());
        PizzaOrder pi  = new PizzaOrder();
        pi.addPizza(p);
        pi.addPizza(p1);
        System.out.println(pi.cost());
    }
}

class PizzaOrder{
    Pizza p[] = new Pizza[3];
    int pizzasAllowed;
    int c;

    PizzaOrder(){
        c = 0;
        pizzasAllowed = 3;
    }
    PizzaOrder(int c, int po){
        pizzasAllowed = po;
    }

    void addPizza(Pizza p1){
        if(c<pizzasAllowed){
            p[c] = p1;
            c++;
        }
        else{
            System.out.println("More cannot be oredered");
        }
    }

    public int cost(){
        int cost = 0;
        for(int i = 0;i<c;i++){
            cost = cost + p[i].calCost();
        }

        return cost;
    }

}