import java.lang.reflect.Constructor;

public class oop_Thread_Class_Constructors {
    public static void main(String[] args) {
        MyThr mt = new MyThr("Muzdalfa"); // Making object of child class from Thread class
        mt.start();// We are starting to execute th thread

        // getId() gives the id of the thread being executed
        System.out.println("The id of thread mt is "+ mt.getId());

        // getName() gives the name of the thread being executed
        // If we consider parameterized constructor
        // We have created a constructor which takes name argument and hence that name would be
        // assigned to this particular thread

        // If no argument is passes then the default name would be given to each thread
        System.out.println("The name of thread mt is "+ mt.getName());

       UseRunnableInterface ur = new UseRunnableInterface();// bullet
       Thread urGun = new Thread(ur);// Gun
        //  we are using constructor of type
        //  Constructor(Runnable r);
        //  We will make a class by implementing runnable and then make an object(bullet)
        // of this runnable and make an object(Gun) of Thread class and then place
        // bullet inside it and this gun object will be passed to this constructor as
        // an argument
       MyThr mt1 = new MyThr(urGun);
       MyThr mt2 = new MyThr(urGun,"Muzdalfa");


    }
}
class MyThr extends Thread{
    // This constructor helps to refer the thread with this name
    public MyThr(String name){
       // This means there is a constructor in Thread class that take the name argument
        super(name);
    }
    public MyThr(Runnable r){
        super(r);
    }
    public MyThr(Runnable r,String name){
        super(r, name);
    }
    public void run(){
        int i=34;
        System.out.println("Thank you...");

    }
}
class UseRunnableInterface implements Runnable{
    public void run(){
        System.out.println("Thread1");
    }
}