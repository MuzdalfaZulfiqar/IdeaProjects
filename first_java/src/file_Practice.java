import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class file_Practice {
    public static void main(String[] args) {
        try {
            ArrayList<Integer> integerList  =  new ArrayList<Integer>();
                    FileInputStream fileIn = new FileInputStream("Integer.txt");
                    Scanner sc = new Scanner(fileIn);
                    while(sc.hasNext()){
                        String n = sc.nextLine();
                        int number = Integer.parseInt(n);
                        integerList.add(number);
                    }
                    int temp = 0;
                    for (int i = 0; i<integerList.size();i++){
                        for (int j= i+1; j<integerList.size();j++){
                            if (integerList.get(i) > integerList.get(j)){
                                temp = integerList.get(i);
                                integerList.set(i,integerList.get(j));
                                integerList.set(j,temp);

                            }
                        }
                    }

                    for (int  i =0; i<integerList.size();i++){
                        System.out.println(integerList.get(i));
                    }
        }// try here
        catch (Exception e){
            System.out.println(e.toString());
        }// catch here
    }// main here
}// class ends here
