// Interfaces means a point where two systems meet or interact

// In java , interfaces means a group of related methods with empty bodies
// In interface all the methods are abstract

// We cannot make the object of interface but can make the reference of the interface
// While using the inheritance we use " extends " keyword
// While using the interface we use " implements " keyword

// Difference
// we cannot make one class from multiple abstract classes
// like class derive extends base1 ,base1
// but,
// we can make one class from multiple interfaces
// like derive1 implements base1,base2

// In interfaces, we need to make our methods as public methods
public class oop_Interfaces {
    public static void main(String[] args) {

    }
}

interface Bicycle{

    // In interfaces, we simply write the method without using the abstract keyword
    // that is for the abstract classes
    void applyBicycle(int inc);
    void speedUp(int dec);

}
class AvonCycle implements Bicycle{
    int speed = 7;
    public void applyBicycle(int inc){
        speed = speed+inc;
    }
    public  void speedUp(int dec){
        speed = speed-dec;
    }
}