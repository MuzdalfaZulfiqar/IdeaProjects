import java.security.cert.CertPath;

public class Computer {
    protected int wordSize;
    protected int memorySize;
    protected int storageSize;
    protected int speed;
    Computer(){
        wordSize = 8;
        memorySize = 1;
        storageSize = 1024;
        speed = 123;
    }

    public Computer(int wordSize, int memorySize, int storageSize, int speed) {
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }
    public void display(){
        System.out.println("Word Size : "+ wordSize);
        System.out.println("Memory Size : "+ memorySize);
        System.out.println("Storage Size : "+storageSize);
        System.out.println("Speed : "+ speed);
    }
}
