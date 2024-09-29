public class assinThree {
    public static void main(String[] args) {
        char my_Array[] = {'c','b','b','a','c','a','b'};
        System.out.println("Original Array.......");
        System.out.println();
        for(char n:  my_Array){
            System.out.print(n+"  ");
        }// for loop ends here
        System.out.println();
        System.out.println("Updated Array.......");
        System.out.println();
        char temp;
        for(int i =0;i<my_Array.length;i++){
            for(int j = i+1;j<my_Array.length;j++){
                if(my_Array[i]>my_Array[j]){
                    temp=my_Array[i];
                    my_Array[i] =  my_Array[j];
                    my_Array[j] = temp;
                }// if ends here
            }// for loop ends here
        }// for loop ends here
        for(char n:  my_Array){
            System.out.print(n+"  ");
        }// for loop ends here
    }// main ends here
}// class ends here
