public class oop_MultiThreading_with_ThreadClass {
    public static void main(String[] args) {
        // MultiThreading allows us to run ;multiple functions at a time without waiting for one function to end
        // Multi processing is heavyweight but multi threading is lightweight
        // multi threading helps fast working
        // Lightweight independent execution in one process: Multi threading


        // Concurrency: You are taking care of multiple tasks but doing one at a time
        // Parallelism: One person cooking food and other chatting at a time now there two tasks being
        // done parallel---> Doing two tasks at a time

       subThreadOne st1 = new subThreadOne();
       subThreadTwo st2 = new subThreadTwo();
       // we use start() method to initiate ot start the thread
        // it will internally call the run() method itself
        st1.start();
        st2.start();

    }
}
// By Extending Thread Class
class subThreadOne extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<400){
            System.out.println("My thread for cooking is running");
            System.out.println("I am happy");
            i++;
        }

    }
}
class subThreadTwo extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<400){
            System.out.println("Thread 2 for chatting with her is good");
            System.out.println("I am sad");
            i++;
        }

    }
}
/* --- OUTPUT-----
Threading is running them simultaneously
otherwise without threading the first object st1 method would run first and later on the second object st2 methid would run

Thread 2 for chatting with her is good
I am sad
Thread 2 for chatting with her is good
I am sad
Thread 2 for chatting with her is good
I am sad
Thread 2 for chatting with her is good
I am happy
My thread for cooking is running
I am happy
My thread for cooking is running
I am happy
My thread for cooking is running
I am happy
My thread for cooking is running
I am happy
Threading is running them simultaneously
Thread 2 for chatting with her is good
I am sad
Thread 2 for chatting with her is good
I am sad
Thread 2 for chatting with her is good
I am sad
Thread 2 for chatting with her is good
*/