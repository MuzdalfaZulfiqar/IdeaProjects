public class oop_Practice_Set_02 {
    public static void main(String[] args) {
        // Problem # 1
        //circle1 obj = new circle1(12);// giving radius
//        cylinder cu = new cylinder(12,14);// giving height

        // problem 2

        rectangle11 r1 = new rectangle11(11,12);
        cuboid c1 = new cuboid(11,12,13);
    }
}

// Problem 1
//class circle1{
//    public int radius;
//    circle1(int r){
//        this.radius = r;
//    }
//
//    public double area(){
//        return Math.PI* this.radius* this.radius;
//    }
//}
//class cylinder extends circle1{
//    cylinder(int r, int h){
//        super(r);
//        this.height = h;
//    }
//
//    public int height;
//    public double volume(){
//        return Math.PI* this.radius* this.radius*this.height;
//    }
//}


class rectangle11{
    rectangle11(int len,int wid){
        this.len=len;
        this.wid=wid;
    }
    public int len;
    public int wid;

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }


    public double area(){
        return len*wid;
    }
}
class cuboid extends rectangle11{

    // constructor
    cuboid(int l,int w,int h){
        super(l,w);
        this.hei = h;

    }
    public int hei;

    public int getHei() {
        return hei;
    }

    public void setHei(int hei) {
        this.hei = hei;
    }
    public double area(){
        return 2*len*wid+2 * len* hei+2*hei * wid;
    }

}