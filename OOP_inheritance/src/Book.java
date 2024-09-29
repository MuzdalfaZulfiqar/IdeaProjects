public class Book extends Publication {
    protected int pageCount;
    Book(){
        super();
        pageCount = 0;
    }
    Book(String title, int price, int pageCount){
        super(title,price);
        this.pageCount = pageCount;
    }
    public void display(){
        super.display();
        System.out.println("Total Pages : "+ pageCount);
    }

}
