public class Movie {
    private String rating;
    private String ID;
    private String title;
    private double price;
    private int day;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    Movie(){
        rating = "NULL";
        ID = "123";
        title = "NULL";
        day = 1;
        price = 20;
    }

    public Movie(String rating, String ID, String title,int day, double price) {
        this.rating = rating;
        this.ID = ID;
        this.title = title;
        this.day = day;
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void equals(Movie m){
        if(ID == m.ID){
            System.out.println("Same");
        }
        else{
            System.out.println("Different");
        }
    }

    public double calculateFees(int day){
        double latefee = 2 * day;
        return latefee;
    }
}

class Action extends Movie{
    public Action() {
    }

    public Action(String rating, String ID, String title, int day, double price) {
        super(rating, ID, title, day, price);
    }

    public double calculateFees(int day){
        double latefee = 3 * day;
        return latefee;
    }
}

class Comedie extends Movie{
    public Comedie() {
    }

    public Comedie(String rating, String ID, String title, int day, double price) {
        super(rating, ID, title, day, price);
    }

    public double calculateFees(int day){
        double latefee = 2.50 * day;
        return latefee;
    }
}
class Drama extends Movie{
    public Drama() {
    }

    public Drama(String rating, String ID, String title, int day, double price) {
        super(rating, ID, title, day, price);
    }

    public double calculateFees(int day){
        double latefee = 2 * day;
        return latefee;
    }
}



class Simple {
    protected int num1;
    protected int num2;

    public Simple(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void add() {
        int result = num1 + num2;
        System.out.println("Addition Result: " + result);
    }

    public void sub() {
        int result = num1 - num2;
        System.out.println("Subtraction Result: " + result);
    }

    public void mul() {
        int result = num1 * num2;
        System.out.println("Multiplication Result: " + result);
    }

    public void div() {
        if (num2 != 0) {
            int result = num1 / num2;
            System.out.println("Division Result: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}

class VerifiedSimple extends Simple {
    public VerifiedSimple(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public void add() {
        if (num1 > 0 && num2 > 0) {
            super.add();
        } else {
            System.out.println("Error: Numbers should be greater than 0 for addition.");
        }
    }

    @Override
    public void sub() {
        if (num1 > 0 && num2 > 0) {
            super.sub();
        } else {
            System.out.println("Error: Numbers should be greater than 0 for subtraction.");
        }
    }

    @Override
    public void mul() {
        if (num1 > 0 && num2 > 0) {
            super.mul();
        } else {
            System.out.println("Error: Numbers should be greater than 0 for multiplication.");
        }
    }

    @Override
    public void div() {
        if (num1 > 0 && num2 > 0) {
            super.div();
        } else {
            System.out.println("Error: Numbers should be greater than 0 for division.");
        }
    }
}

