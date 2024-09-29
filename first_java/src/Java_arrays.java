public class Java_arrays
{
    public static void main(String[] args)
    {
        // class of 5 students
        int [] marks;
        marks = new int [5];
        marks[1] = 12;
        marks[2] = 13;
        marks[0] = 11;
        marks[3] = 14;
        marks[4] = 15;
        System.out.println(marks[1]);

        // method 2
        int [] maArk = new int [5];
        for(int n : maArk)
        System.out.println(n);

        // method 3
        int [] mark = {1, 2 , 3, 4, 5};
        System.out.println(marks.length);
        System.out.println(mark[3]);


        // displaying in reverse order
        for (int i=marks.length-1;i >=0; i--){
            System.out.println(marks[i]);
        }

        // for each loop
        for(int elements: marks){
            System.out.println(elements);
        }




    }

}
