public class Main {
    public static void main(String[] args) {

        // Mammal class
        Mammal m = new Mammal("Brown","Platypus",3);
        System.out.println(m.toString());
        m.eat();
        m.run();
        System.out.println();
        // Bird Class
        Bird b = new Bird(89, "Parrot", 3);
        System.out.println(b.toString());
        b.eat();
        b.fly();
    }// main method ends here
}// Class ends here