public class labTask_3 {
    public static void main(String[] args) {
        int array [] = {3,56,23,12,5,34,0};
        System.out.print("Before sorting : ");
        for(int elements : array){
            System.out.print(elements + " ") ;
        }// for each loop ends here
        System.out.println();
        sortArray(array);
    }// main ends here
    public static void sortArray(int A[]){
        for(int i=0;i<A.length-1;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                if(A[i]>=A[j]){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }// if ends here
            }// inner - for loop ends here
        }// outer - for loop ends here
        // Displaying the sorted array elements
        System.out.print("After sorting : ");
        for(int elements : A){
            System.out.print(elements + " ") ;
        }// for each loop ends here
    }// method ends here
}//Class ends here