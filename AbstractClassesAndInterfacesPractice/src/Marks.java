public abstract class Marks {
    double percentage;
    int totalMarks;
    Marks(){
        totalMarks = 0;
    }
    public abstract double getPercentage();
}

class A extends Marks{
    int mark1;
    int mark2;
    int mark3;
    A(){

    }
    A(int m1, int m2, int m3){
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
        totalMarks = 300;
    }


    @Override
    public double getPercentage() {
        percentage = (mark1 + mark2 + mark3)/(double)totalMarks * 100.0;
        return percentage;
    }
}
class B extends Marks
{
    int mark1;
    int mark2;
    int mark3;
    int mark4;
    B(){

    }
    B(int m1, int m2, int m3, int m4){
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
        mark4 = m4;
        totalMarks = 300;
    }


    @Override
    public double getPercentage() {
        percentage = (mark1 + mark2 + mark3 + mark4)/(double)totalMarks * 100.0;
        return percentage;
    }
}

class MarksCheck{
    public static void main(String[] args) {
        A a  = new A(90,89,100);
        System.out.println(a.getPercentage());
    }
}