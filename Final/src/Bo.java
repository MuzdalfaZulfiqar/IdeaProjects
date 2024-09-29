public class Bo extends  Publication{
    int page;
    Bo(int p){
        super();
        page= p;
    }
    public void display(){
        super.display();
        System.out.println(page);
    }
}

class Publication{
    String title;
    int price;
    Publication(){
        price =10;
        title = null;
    }
    Publication(int p, String s){
        price = p;
        title = s;
    }

    public void display(){
        System.out.println("Title" + title);
    }
}


class Tape extends  Publication{
    int min;
    Tape(){

    }
    Tape(int m){
        super();
        min = m;
    }
    public void display(){
        super.display();
        System.out.println(min);
    }
}

class dddd{
    public static void main(String[] args) {
        Bo b = new Bo(9);
        b.display();
    }
}