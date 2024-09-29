public class oop_Thread_Priorities {
    public static void main(String[] args) {
        MyThrOne mt1 = new MyThrOne("Muz1");
        MyThrOne mt2 = new MyThrOne("Muz2");
        MyThrOne mt3 = new MyThrOne("Muz3");
        MyThrOne mt4 = new MyThrOne("Muz4");
        MyThrOne mt5 = new MyThrOne("Muz5 (Most Imp)");

        // Default priority is Norm
        mt5.setPriority(Thread.MAX_PRIORITY);
        mt1.setPriority(Thread.MIN_PRIORITY);
        mt2.setPriority(Thread.MIN_PRIORITY);
        mt3.setPriority(Thread.MIN_PRIORITY);
        mt4.setPriority(Thread.MIN_PRIORITY);
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        mt5.start();
    }
}
class MyThrOne extends Thread{
    MyThrOne(){
    }
    public MyThrOne(String name){

        super(name);
    }

    public void run(){
        while(true){
    int i=34;
    System.out.println("Thank you..."+this.getName());
}
    }
}