public class oop_practice_01 {
    public static void main(String[] args) {
        // problem 1
//        test muzdalfa = new test();
//        muzdalfa.setName("Ali");
//        System.out.println(muzdalfa.getName());
//        muzdalfa.salary=34;
//        System.out.println(muzdalfa.getSalary());

        // Problem 2
//        cellPhone cs = new cellPhone();
//        cs.ring();
//        cs.vibrate();


        // problem 3
//        square s = new square();
//        s.side=4;
//        System.out.println("The area is "+ s.getArea());
//        System.out.println("The perimeter is "+ s.getPerimeter());



        // problem 4
//        rectangle s = new rectangle();
//        s.len=4;
//        s.wid = 5;
//        System.out.println("The area is "+ s.getArea());
//        System.out.println("The perimeter is "+ s.getPerimeter());

        // Problem 5
        Tommy n = new Tommy();
        n.fire();
        n.hit();
        n.run();
    }
}
//
//class test{
//
//    int salary;
//    public int getSalary(){
//        return salary;
//    }
//    String name;
//    public String  getName(){
//        return name;
//    }
//    public void setName(String n){
//        name = n;
//    }
//}

//class cellPhone{
//
//    public void ring(){
//        System.out.println("Ringing");
//    }
//    public void vibrate(){
//        System.out.println("Vibrating");
//    }
//}

//class square{
//
//    int side = 2;
//    int area;
//    int perimeter;
//
//    public  int getArea(){
//        area = side * side;
//        return  area;
//    }
//    public  int getPerimeter(){
//        perimeter = side+side+side+side;
//        return  perimeter;
//    }
//}

//class rectangle{
//
//    int len;
//    int wid;
//    int area;
//    int perimeter;
//
//    public  int getArea(){
//        area = len * wid;
//        return  area;
//    }
//    public  int getPerimeter(){
//        perimeter = len+len+wid+wid;
//        return  perimeter;
//    }
//}

class Tommy{
    public void hit(){
        System.out.println("Hitting...");
    }
    public void run(){
        System.out.println("Running...");
    }
    public void fire(){
        System.out.println("Firing....");
    }
}