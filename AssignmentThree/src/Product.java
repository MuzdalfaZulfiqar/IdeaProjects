public class Product {
    public String productName;
    public double price;
    Product(){
        productName = null;
        price = 100.0;
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double bill(){
        return getPrice();
    }
}

class DiscountedProduct extends  Product{
    int discount;
    DiscountedProduct(){
        super();
        discount = 0;
    }
    DiscountedProduct(String productName, double price, int discount){
        super(productName,price);
        this.discount = discount;
    }
    public double bill(){
        double discountedAmount = getPrice() * (discount/100.0);
        return getPrice() - discountedAmount;
    }
}

class CustomerCart{
    Product p[];
    int currentItemsList;
    CustomerCart(){
        p = new Product[10];
        currentItemsList = 0;
    }

    CustomerCart(Product p[] ){
        this.p = p;
        currentItemsList = 0;
    }

    public void addToCart(Product prod){
        if(currentItemsList < p.length){
            p[currentItemsList] = prod;
            currentItemsList ++;
        }
        else{
            System.out.println("More items cannot be added to the cart...");
        }
    }

    public double bill(){
        double bill = 0.0;
        for(int i = 0; i< currentItemsList;i++){
            bill = bill + p[i].bill();
        }
        return bill;
    }

    public void displayProducts(){
        System.out.println("Products...");
        for(int i = 0; i<currentItemsList;i++){
            if (!(p[i] instanceof DiscountedProduct)) {
                System.out.println(p[i].productName);
            }
        }// for loop ends here

        System.out.println("Discounted Products...");
        for(int i = 0; i<currentItemsList;i++){
            if(p[i] instanceof DiscountedProduct){
                System.out.println(p[i].productName);
            }
        }// for loop ends here
    }// methods ends here
}// class ends here