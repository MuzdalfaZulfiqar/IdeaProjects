public class OOP_Practice_set_01 {
    public static void main(String[] args) {

        // problem 1
        cylinders cy = new cylinders();
       // cy.setHeight(4);
        System.out.println("The height is "+ cy.getHeight());
        //cy.setRadius(5);
        System.out.println("The radius is "+ cy.getRadius());

        // problem 2
        System.out.println("The area of cylinder is "+ cy.area());
        System.out.println("The volume of cylinder is "+cy.volume());

        // problem 4
        rectangle rec = new rectangle();
        System.out.println(rec.getLen());
        System.out.println(rec.getWid());
    }
}
class cylinders{
    double PI = 3.14159;
    private double height;
    private double radius;

    // problem 1
    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        height=h;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius = r;
    }
    // problem 2
    public double area(){
        double a;
        a = 2*PI*radius*height + 2*PI*radius*radius;
        return a;
    }
    public double volume(){
        double v;
        v = PI*radius*radius* height;
        return v;
    }

    // problem 3
    // constructor use
    public cylinders(){
        height = 12;
        radius = 9;
    }
}

class rectangle{
    private int len;
    private int wid;

    public  rectangle() {
        len = 4;
        wid = 5;
    }
    public int getLen(){
        return len;

    }
    public int getWid(){
        return wid;
    }
    public rectangle(int l,int w){
        this.len = l;
        this.wid=w;
    }

}