public class java {
    public static void main(String[] args) {
//        int [] marks;
//        marks = new int [5];
//        marks[0] = 100;
//        marks[1] = 60;
//        marks[2] = 70;
//        marks[3] = 90;
//        marks[4] = 86;
//        //marks[5] = 90;
//        System.out.println(marks[4]);
//
//        int [] mark = new int [4];
//        int [] mar ;
//        mar = new int [4];
//        int [] ma = {1 , 3, 5, 7};
//        System.out.println(ma[1]);


        // starting from 0 and moving to one less than length means from i to n-1
        int [] stu = {56, 78, 67,45,34};
        for(int i =0; i<stu.length;i++ ) {
            System.out.println(stu[i]);
        }

        System.out.println(   );


        // starting from one less than length and to 0 from n-1 to i
        int [] marks = {90,55, 67,23,56};
        for(int i = marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }

        for (int elements:marks) {
            System.out.println(elements);

        }

        int [][] flats;
        flats = new int [2][3];
        flats[0][0] =101;
        flats[0][1] =102;
        flats[0][2] =103;
        flats[1][0] =201;
        flats[1][1] =202;
        flats[1][2] =203;

        for(int i =0; i<flats.length;i++ ) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}