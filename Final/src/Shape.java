public interface Shape {
    public double getArea();
}

class Circle implements  Shape{
    double a = 2;
    public double getArea(){
        return (2 * Math.PI * a);
    }
}

class Rectangle implements Shape{
    int a = 10;
    int b = 10;
    public double getArea(){
        return (a * b);
    }
}

class book{
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getArea());
    }
}
