public abstract class Shape {
    public abstract int RectangleArea(int len,int wid);
    public abstract int SquareArea(int side);
    public abstract int circleArea(int r);
}
class findingAreas extends Shape {
    @Override
    public int RectangleArea(int len, int wid) {
        return len* wid;
    }

    @Override
    public int SquareArea(int side) {
        return side * side
                ;
    }

    @Override
    public int circleArea(int r) {
        return (int) ((int)2*Math.PI * r);
    }
}

class shapeTest{
    public static void main(String[] args) {
        findingAreas area = new findingAreas();
        System.out.println(area.SquareArea(2));
    }
}