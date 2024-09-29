public class oop_This_And_Super {
    public static void main(String[] args) {
        ekClass e = new ekClass(5);// goes to the constructor
        // will set the value of a equal to v and move to next line
        System.out.println(e.getA());// here goes to getA method and will print the value
        doClass d = new doClass(5);
    }
}

// question? Do we use super only for the constructors
class ekClass{
    int a;

    public int getA() {
        return a;
    }

    ekClass(int a){
        this.a=a;
        // we give the class variable this operator and assign it to the parameter
    }

    public int returnOne(){
        return 1;
    }
}
class doClass extends ekClass{

    // a constructor
    doClass(int c){
        super(c);
        System.out.println("I am a constructor");
    }




    // method
//    public void check(int c){
//        super(c);
//        System.out.println("I am a constructor");
//    }

    // giving an error ,so we find out that the super is used in constructor
}