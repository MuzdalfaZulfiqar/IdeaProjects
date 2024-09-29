public class Laptop extends Computer{
    protected  int length;
    protected int width;
    protected int height;
    protected int weight;

    public Laptop(int length, int width, int height, int weight) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public Laptop(int wordSize, int memorySize, int storageSize, int speed, int length, int width, int height, int weight) {
        super(wordSize, memorySize, storageSize, speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
    public void display(){
        super.display();
        System.out.println("Length : "+ length);
        System.out.println("Width : "+ width);
        System.out.println("Height :"+ height);
        System.out.println("weight : "+ weight);
    }
}
