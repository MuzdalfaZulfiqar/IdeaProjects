public class Java_resulting_dataTypes {
    public static void main(String[] args) {

        // the result of this will be integer
        int  f =1+2;
        // the result of this will be floating value
        float b = 9.9f+ 2;



        // Incrementing and decrementing
        int i = 56;
        // a = i++;
        // first i is assigned a(56) and then value of i is incremented
        System.out.println(i++);
        System.out.println(i);

        // if i = 56
        // b= ++i;
        // first value of incremented and then that new value is assigned b(57)
        System.out.println(++i);
        System.out.println(i);
        System.out.println(i++);
        System.out.println(i);

        int y=7;
        int x= ++y * 8;
        System.out.println(x);

        int s=7;
        int r = s++ * 8;
        System.out.println(r);

        char ch = 'a';
        System.out.println(++ch);



    }
}
