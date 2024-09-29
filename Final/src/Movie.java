import java.util.ArrayList;
import java.util.Scanner;

public class Movie {
    int rating;
    int num;
    String name;
    int price;
    Movie(){

    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Movie(String n, int i, int r){
        num = i;
        rating = r;
        name = n;
    }

    public boolean equals(Object o){
        Movie m  = (Movie) o;
        if(this.num == m.num){
            return  true;
        }
        else{
            return false;
        }
    }

    public  int lateFee(int days){
        return ( price + (2 * days) );
    }
}

class Action extends Movie{
    Action(){
        super();
    }
    public  int lateFee(int days){
        return ( price + (3 * days) );
    }

}
class Comedy extends Movie{
    Comedy(){
        super();
    }
    public  int lateFee(int days){
        return ( price + (2 * days) );
    }

}


class hj{
    public static void main(String[] args) {
//        Action a = new Action();
//        System.out.println(a.lateFee(1));

        Scanner input = new Scanner(System.in);
        ArrayList<Double> score = new ArrayList<>();
        for(int i = 0;i<7;i++){
            System.out.println("eNTER score of j "+ (i+1));
            double d = input.nextDouble();
            score.add(d);
        }

        int maxIndex = -1;int minIndex = 0;
        double minValue = 2222;
        for(int i = 0;i< 7;i++){
            if(score.get(i) < minValue){
                minValue = score.get(i);
                minIndex = i;
            }
        }

        score.remove(minIndex);
        double maxValue = -1;
        for(int i = 0;i< 6;i++){
            if(score.get(i) > maxValue){
                maxValue = score.get(i);
                maxIndex = i;
            }
        }

        score.remove(maxIndex);

        double so = 0;
        for(Double d : score){
            so = so + d;
        }

        System.out.println(so);
    }
        }