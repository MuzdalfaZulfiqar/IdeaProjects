public abstract class Parent {
    //Create an abstract class 'Parent' with a method 'message'.
    // It has two subclasses each having a method with the same name
    // 'message' that prints "This is first subclass" and "This is
    // second subclass" respectively.
    // Call the methods 'message' by creating an object for each subclass.

    String name;
    Parent(){

    }
    public Parent(String name) {
        this.name = name;
    }

    public abstract void message();
}

class SubClassOne extends Parent{
    SubClassOne(){

    }

    public SubClassOne(String name) {
        super(name);
    }

    @Override
    public void message() {
        System.out.println("This is subclass one");
    }
}
class SubClassTwo extends Parent{
    SubClassTwo(){

    }

    public SubClassTwo(String name) {
        super(name);
    }

    @Override
    public void message() {
        System.out.println("This is subclass Two");
    }
}

class ParentCheck{
    public static void main(String[] args) {
        SubClassOne one = new SubClassOne();
        one.message();
        SubClassTwo two = new SubClassTwo();
        two.message();
    }
}