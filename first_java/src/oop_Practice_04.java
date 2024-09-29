public class oop_Practice_04 {
    public static void main(String[] args) {
        welcome w = new welcome();
        goodMorning g= new goodMorning();
        w.setPriority(Thread.MAX_PRIORITY);
        System.out.println(w.getPriority());
        System.out.println(w.getState());// means stage of lifeCycle
        System.out.println(Thread.currentThread().getState());
        w.start();
        System.out.println(w.getState());
        g.start();

    }
}
class welcome extends Thread{
    public void run(){
        int i=0;
        while(i<400)
        {

            try{
                Thread.sleep(200);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Welcome..");
            i++;
    }
    }
}
class goodMorning extends Thread{
    public void run(){
        int i=0;
        while(i<400)
        {
            System.out.println("Good morning..");
i++;
        }
    }
}
