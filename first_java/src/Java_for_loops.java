public class Java_for_loops {
    public static void main(String[] args) {
        // odd numbers till a particular range
        System.out.println("odd numbers till a particular range");
        for (int i=1 ; i <=50; i=i+2){
            System.out.println(i);
        }
        // even numbers till particular range
        System.out.println("even numbers till particular range");
        for (int j=0; j<=50; j= j+2){
            System.out.println(j);
        }

        // 2i = Even Numbers = 0, 2, 4, 6.....
        // 2i+1 = Odd Numbers = 0, 1, 3, 5.....

        // first n odd numbers
        System.out.println("first n odd numbers");
        int n=5;  // first 5 odd numbers
        // initialize from 0, check 1 by 1 and then incrementing
        for (int i=0 ; i < n; i++){
            System.out.println(2*i+1);
        }

        // first n even numbers
        System.out.println("first n even numbers");
        int num = 5;
        for (int j = 0; j<num; j++){
            System.out.println(2*j);
        }

        System.out.println("Decrementing for loop");
        for (int i = 5; i!=0; i--){
            System.out.println(i);
        }

        // first n natural numbers in reverse order
        System.out.println("first n natural numbers in reverse order");
        int n3 = 10;
        for (int i=n3; i>0;i-- ){
            System.out.println(i);
        }

        // first n odd numbers in reverse order
        System.out.println("First n odd numbers in reverse order");
        int n1 = 10;
        for (int i =n1-1 ;i>=0; i--){
            System.out.println(2*i+1);
        }

        // first n even numbers in reverse order
        System.out.println("First n even numbers in reverse order");
        int n2 = 10;
        for (int i =n2-1 ;i>=0; i--){
            System.out.println(2*i);
        }




    }
}
