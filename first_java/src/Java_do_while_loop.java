

public class Java_do_while_loop {
    public static void main(String[] args) {

        int a = 10;
        do{
            System.out.println(a);
            a++;
        }while (a<5);
        // the do while loop will execute at least once must in this case
        // if a > 5 then only 0 will be printed first it is printed then the
        // condition is checked

        int n = 1;
        do{
            System.out.println(n);
            n++;
        }while (n<=100);
    }
}
