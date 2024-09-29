public abstract class Computation {
    double val1;double  val2;
    Computation(){

    }

    public Computation(double v1) {
        val1 = v1;
    }

    public abstract double com();
}

class l_to_g extends Computation{

    public l_to_g() {
    }
    public l_to_g(double v1) {
        super(v1);
    }
    public double com(){
        val2 = val1 * 0.264172;
        return val2;
    }
}
class ftom extends Computation{

    public ftom() {
    }
    public ftom(double v1) {
    super(v1);
    }

    public double com(){
        val2 = val1 * 0.3048;
        return val2;
    }
}

class ComCh
{
    public static void main(String[] args) {
        Computation c[] = new Computation[2];

        ftom d = new ftom(12);
        c[0] = d;
        c[1] = new l_to_g(12);

        for(int i = 0;i<2;i++){
            System.out.println(c[i] .val1);
            System.out.println(c[i].com());
        }
    }
}