import java.awt.event.ContainerAdapter;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(){
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

        score.remove(maxIndex);
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


class Contact{
    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String f;
    String l;
    int phone;String email;
    Contact(){

    }
    Contact(String  f1, String l1, String e, int p){
        f = f1;
        email = e;
        phone = p;
        l = l1;
    }


    void display(){
        System.out.println(f);
        System.out.println(l);
        System.out.println(phone);
        System.out.println(email);
    }
}