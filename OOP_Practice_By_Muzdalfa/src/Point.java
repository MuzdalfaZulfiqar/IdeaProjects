import javax.crypto.Cipher;

public class Point {
    int x;
    int y;
    Point(){
        x = 0;
        y = 0;

    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int[] getXY(){
        int [] a  = new int[2];
        a[0] = getX();
        a[1] = getY();
        return a;
    }
    public double dis(int x, int y){
        double b;
        b = Math.sqrt(Math.pow(x-getX(),2)+Math.pow(y-getY(),2));
        return b;
    }
    public double dis(){
        double b;
        b = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return b;
    }
    public double dis(Point p){
        double b;
        b = Math.sqrt(Math.pow(x-p.getX(),2)+Math.pow(y-p.getY(),2));
        return b;
    }

}

class MyCircle{
    Point center;
    int radius;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    MyCircle(){

    }
    MyCircle(Point p, int rad){
        this.center = p;
        radius = rad;
    }

    public int getCenterX(){
        return center.getX();
    }public int getCenterY(){
        return center.getY();
    }
    public void setCenterX(int x1){
        center.x = x1;
    }public void setCenterY(int y1){
        center.y = y1;
    }


    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }
    public int [] getCenterXY(){
        return center.getXY();
    }
    public double distance(MyCircle c){
        double b = center.dis(c.center);
        return b;
    }
}

class Tri{
    Point v1;
    Point v2;
    Point v3;
    Tri(){

    }
    public Tri(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public double perimeter(){
        double b = 0;
        double side1 = side1();
        double side2 = side2();
        double side3 = side3();
        b = side3 + side1 + side2;
        return b;
    }

    public double side1(){
        double side =  v1.dis(v2);
        return side;
    }public double side2(){
        double side =  v2.dis(v3);
        return side;
    }public double side3(){
        double side =  v1.dis(v3);
        return side;
    }

    public  String getType(){
        if(side1() == side2() && side2() == side3()){
            return "Equilateral";
        }
        else if(side1() == side2() ||  side2() == side3() || side1() == side3()){
            return  "Isosceles";
        }
        else{
            return "Scalen";
        }
    }
}
