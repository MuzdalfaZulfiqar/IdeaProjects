import java.util.Date;

public class DateValidation {
    int day;
    int mon;
    int year;

    DateValidation(){

    }DateValidation(int d, int m, int y){
        day = checkDay(d);
        mon = checkMonth(m);
        year = y;
    }

    public int checkDay(int d){
        if(mon == 1 || mon==3  || mon == 5 || mon==7 || mon==8 ||mon==10 || mon == 12){
            if(d>=1 && d<= 31){
                return d;
            }
            else{
                System.out.println("resetted to 1");
                return 1;
            }
        }
        else if(mon==2){
            if(year % 4 ==0){
                if(d>=1 && d<=29){
                    return d;
                }
                else{
                    return 1;
                }
            }
            else{
                if(d>=1 && d<=28){
                    return d;
                }
                else{
                    return 1;
                }
            }
        }
        else{
            if(d >= 1 && d<= 30){
                return d;
            }
            else{
                return 1;
            }
        }
    }
    public int checkMonth(int m){
        if(m >= 1 && m <= 12){
            return m;
        }
        else{
            System.out.println("Resetted to 1");
            m = 1;
        }
        return m;
    }

    public void display(){
        System.out.println(day);
        System.out.println(mon);
        System.out.println(year);
    }
}

class e{
    String name;
    DateValidation hire;
    e(){

    }
    e(String  n, DateValidation h){
        hire = h;
        name = n;

    }
    void display(){
        System.out.println(hire.day);
        System.out.println(name);
    }
}

class Clll{
    public static void main(String[] args) {
        DateValidation d = new DateValidation(1,2,2002);
        e e1 = new e("N",d);
        e1.display();
    }

}