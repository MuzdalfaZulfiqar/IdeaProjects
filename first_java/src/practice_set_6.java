public class practice_set_6
{
    public static void main(String[] args)
    {
        // question # 1:
//        float elements;
//        float sum = 0;
//        float [] mark  = {11.5f, 22.5f, 33.5f, 44.5f,55.5f};
//        for(int i = 0; i<mark.length; i++)
//        {
//            elements = mark[i];
//            sum = sum + elements;
//
//        }
//        System.out.println("The sum is : "+ sum);


        // problem # 2

        float elements;
        float num = 55.5f;
        boolean isInArray = false;
        float [] mark  = {11.5f, 22.5f, 33.5f, 44.5f,55.5f};
        for(int i = 0; i<mark.length; i++)
        {
            if (num == mark[i]){
                isInArray = true;
                break;
            }

        }
        if (isInArray){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        // problem # 3
        int sum = 0;
        int [] marks = {50, 60, 70, 80, 90};
        for(int element: marks){
            sum = sum + element;
        }
        int avg = sum/marks.length;
        System.out.println("The average is :"+ avg);

        // problem # 4;
        int [][] mat1 = {{1,  2 , 3}
                        ,{4 , 5 , 6}};
        int [][] mat2 = {{2,  6 , 13}
                        ,{3 , 7 , 7}};
        int [][] result = {{0,  0 , 0}
                        ,{0 , 0 , 0}};
        for (int i = 0; i< mat1.length; i++) // row no. of times
        {
            for (int j = 0; j< mat1[i].length; j++)  // column number of times
            {
                System.out.format("Setting value for i = %d and j= %d\n" , i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for (int i = 0; i< mat2.length; i++) // row no. of times
        {
            for (int j = 0; j< mat2[i].length; j++)  // column number of times
            {
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        }

        // question # 5
        int [] lop = {1,2,3,4,5};
        for (int i = lop.length-1; i>=0; i--){
            System.out.println(lop[i]);

        }

        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for (int i = 0; i<n; i++)
        {
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int elem: arr){
            System.out.println(elem);
        }


        // question 6
        int [] mar = { 1,2 ,3 ,4,-5,6,8,10};
        int max = Integer.MIN_VALUE;
        for (int number = 0; number<mar.length; number++)
        {
            if (number>max)
            {
                max = mar[number];
            }
        }
        System.out.println(max);


        // question7
        int [] marr = { 1,2 ,3 ,4,5,6,8,10};
        int min = Integer.MAX_VALUE;
        for (int number = 0; number<mar.length; number++)
        {
            if (number<min)
            {
                min = mar[number];
            }
        }
        System.out.println(min);

        // QUESTION # 8
        int [] marRR = { 1,2 ,3 ,4,78,98,5,6,8,10};
        Boolean isSorted= true;
        for (int i = 0; i< marRR.length-1; i++){
            if (marRR[i] > marRR[i+1]){
                isSorted = false;
                break;
            }

        }
        if (isSorted){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }

}
