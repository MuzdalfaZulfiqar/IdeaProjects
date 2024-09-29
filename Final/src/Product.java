public class Product {
    String name;int pri;

    Product(){

    }
    public Product(String name, int pri) {
        this.name = name;
        this.pri = pri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPri() {
        return pri;
    }

    public void setPri(int pri) {
        this.pri = pri;
    }

    public int getBill(){
        return (pri);
    }
}

class Discouted extends Product{
    int dics;
    Discouted(){

    }

    public Discouted(int dics) {
        this.dics = dics;
    }

    public Discouted(String name, int pri, int dics) {
        super(name, pri);
        this.dics = dics;
    }

    public int getBill(){
        return (pri - (pri * dics));
    }
}

class CART{
    Product p[];
    int current;
    CART(){
        p = new Product[4];
        current = 0;
    }

    public CART(Product[] p, int current) {
        this.p = p;
        this.current = current;
    }

    public Product[] getP() {
        return p;
    }

    public void setP(Product[] p) {
        this.p = p;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }
    void addProduct(Product p1){
        p[current] = p1;
        current++;
    }

    int getBill(){
        int bill = 0;
        for(int i =0;i<current;i++){
            bill = bill + p[i].getBill();
        }

        return bill;
    }

    public void display(){
        for(int i = 0;i<current ;i++){
            if(p[i] instanceof Discouted){
                System.out.println("Disc - "+p[i]);
            }
            else{
                System.out.println("Prod - "+p[i]);
            }
        }
    }
}

class CartVhecl{
    public static void main(String[] args) {
        Product d = new Product("Tii",122);
        Product d1 = new Product("Too",122);
        Discouted ds = new Discouted("TITO",122,2);

        CART c= new CART();
        c.addProduct(d);
        c.addProduct(d1);
        c.addProduct(ds);

        System.out.println(c.getBill());

        c.display();
    }
}
