public class Publication {
    protected  String title;
    protected  int price;

    public Publication(){
        title  = "BOOK";
        price = 500;
    }
    public Publication(String title, int price) {
        this.title = title;
        this.price = price;
    }
    public  int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void display(){
        System.out.println("Title : " + title);
        System.out.println("Price : "+ price);
    }
}
