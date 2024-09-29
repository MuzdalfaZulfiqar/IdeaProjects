public class Fraction {
    int num;
    int den;
    Fraction(){

    }
    Fraction(int i,int j){
        num = i;
        den = j;
    }

    boolean equals(Fraction f){
        if(num == f.num && den == f.den){
            return true;
        }
        else{
            return  false;
        }
    }
}
