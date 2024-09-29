public class Product {
    String productName;
    double price;
    Product(){
        productName = null;
        price = 100;
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
    public double bill(){
        return  price;
    }
}

class DiscountedProduct extends Product{
    int discount;
    DiscountedProduct(){
        super();
    }

    public DiscountedProduct(int discount) {
        super();
        this.discount = discount;
    }

    public DiscountedProduct(String productName, double price, int discount) {
        super(productName, price);
        this.discount = discount;
    }

    @Override
    public double bill() {
        double prodDisc = price * (discount/100.0);
        return (price-prodDisc);
    }
}

class Cart{
    Product p[];
    int totalProducts;
    Cart(){
        totalProducts = 0;
        p = new Product[10];
    }

    public Cart(Product[] p, int totalProducts) {
        this.p = p;
        this.totalProducts = totalProducts;
    }

    public void addProduct(Product item){
        if(totalProducts <10){
            p[totalProducts] = item;
            totalProducts++;
        }
        else{
            System.out.println("More products cannot be added in cart.");
        }
    }

    public void bill(){
        double cartTotal = 0.0;
        for(int i = 0 ; i< totalProducts; i++){
            cartTotal += p[i].bill();
        }
        System.out.println("Bill : "+cartTotal);
    }

    public  void displayCart(){
        for(int i = 0 ; i< totalProducts; i++){
            if(p[i] instanceof DiscountedProduct){
                System.out.println("DP : "+p[i].productName);
            }
            else{
                System.out.println("P : "+p[i].productName);
            }
        }
    }
}

class Check{
    public static void main(String[] args) {
        Cart c = new Cart();
        Product p1 = new Product("Book",100);
        Product p2 = new Product("Journal",100);
        DiscountedProduct d = new DiscountedProduct("Magazine",100,10);
        c.addProduct(p1);
        c.addProduct(p2);
        c.addProduct(d);
        c.bill();
        c.displayCart();
    }
}