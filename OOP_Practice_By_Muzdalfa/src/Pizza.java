public class Pizza {
    String size;
    int cheese;
    int peperoni;
    int ham;
    Pizza(){
        size = "small";
        ham = 2;
        peperoni = 2;
        cheese = 2;
    }
    Pizza(String s, int p, int h, int c){
        cheese = c;
        peperoni = p;
        ham = h;
        size = s;
    }
    public double calCost(){
        if(size.equals("small")){
            return 10 + (2*cheese) + (2*peperoni) + (2*ham);
        }
        else if(size.equals("medium")){
            return 12 + (2*cheese) + (2*peperoni) + (2*ham);
        }
        else{
            return 14 + (2*cheese) + (2*peperoni) + (2*ham);
        }
    }

    public void dis(){
        System.out.println("SIZE " +size);

    }
}
class PizzaOrder{
    Pizza p[];
    int order;
    PizzaOrder(){
        p = new Pizza[3];
        order = 0;
    }

    public void add(Pizza p1){
        if(order<3){
            p[order]  = p1;
            order++;
        }
        else{
            System.out.println("Np order");
        }
    }
    public void calCost(){
        double sum = 0;
        for(int i=0;i<order;i++) {
            sum = sum + p[i].calCost();
        }
        System.out.println(sum);
    }
}
