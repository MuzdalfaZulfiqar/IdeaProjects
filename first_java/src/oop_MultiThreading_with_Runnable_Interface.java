public class oop_MultiThreading_with_Runnable_Interface {
    public static void main(String[] args) {
        // We are creating a bullet
        MYthreadRunnableOne bullet1 = new MYthreadRunnableOne();
        // Then for every bullet we are creating a gun and putting that bullet in the gun
        Thread gun1 = new Thread(bullet1);
        MYthreadRunnableTwo bullet2 = new MYthreadRunnableTwo();
        Thread gun2 = new Thread(bullet2);
        // We cannot directly implement the start() method on runnable interface
        gun1.start();
        gun2.start();

        // We must overRide the run() method
    }
}
class MYthreadRunnableOne implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(i<400) {
            System.out.println("I am a thread 1 not a thread 1");
            i++;
        }

    }
}
class MYthreadRunnableTwo implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(i<400) {
            System.out.println("I am a thread 2 not a thread 2");
            i++;
        }
    }
}
