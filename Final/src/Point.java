import java.nio.channels.Pipe;

public class Point {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    Point(){

    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point add(Point p1,Point p2){
        Point pnew = new Point();
        pnew.x = x + p1.x  + p2.x;
        pnew.y = y + p1.y  + p2.y;
        return pnew;
    }
    void dispkay(){
        System.out.println(x);
        System.out.println(y);
    }
}
class Line{
    Point p1;
    Point p2;
    Line(){

    }
    Line(Point pa, Point pb ){
        p1 = pa;
        p2 = pb;
    }

    void length(){
       double len = Math.sqrt(Math.pow((p2.getX()-p1.getX()),2) + Math.pow((p2.getY()-p1.getY()),2));
        System.out.println(len);
    }
}

//class l{
//    public static void main(String[] args) {
//        Point p1 = new Point(12,3);
//        Point p2 = new Point(12,3);
//        Line l1 = new Line(p1,p2);
//        l1.length();
//    }
//
//        }