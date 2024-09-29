
public class oop_Thread_Methods {
    public static void main(String[] args) {
        MyThrTwo mtT = new MyThrTwo();
        MyThrThree t3 = new MyThrThree();
        // mtT and mtT1 both are initiated at the same time if we want to start mtT1 only after mtT ends \
        // we will use .join() method
        mtT.start();
//        try {
//            // join method cannot be used without try catch bcz it throws exception
//            mtT.join();
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
       t3.start();


    }

}
class MyThrTwo extends Thread{

    public void run(){
        int i=0;

        while(true){
            System.out.println("Thank you...");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
class MyThrThree extends Thread{

    public void run(){
        int i=0;
        while(true){
            System.out.println("My Thank you...");
            i++;
        }
    }
}