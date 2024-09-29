import java.

class number{
    int count;
    int index;
    number(){

    }
    number(int n1,int n2){
        count = n1;
        index = n2;
    }
}

class Solution {
    public int singleNumber(int[] nums) {

        int countE = 0;
        // int [] count = new int[nums.length];
        Arraylist <number> count = new Arraylist<>();
        for(int i = 0; i< nums.length;i++){
            number n = new number(nums[i], countE++ );
            count.set(nums[i] , n);
        }

        for(number n1 : count){
            if(n1.count == 1){
                return n1.index;
            }
        }

        // int element = 0;
        // for(int i = 0;i<countArray.length;i++){
        //     if(countArray[i] == 1){
        //         element = i;
        //     }
        // }
        // return 0;
    }
}
