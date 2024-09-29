public class Distance {
    int feet;
    int inch;
    Distance(){
        inch = 0;
        feet = 0;
    }
    Distance(int i, int f){
        inch  =i;
        feet = f;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    void display(){
        System.out.println(feet);
        System.out.println(inch);
    }

    Distance add(Distance d1){
        Distance d = new Distance();
        d.feet = feet + d1.feet;
        d.inch = inch + d1.inch;
        return d;
    }

}
