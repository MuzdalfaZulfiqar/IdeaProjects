import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filePractice {
    public static void main(String[] args)
    {
         //code to create a new file
        File myFile = new File("fileOne.txt");
        try
        {
            myFile.createNewFile();
        } catch (IOException e)
        {
            System.out.println("Unable to create this file");
            throw new RuntimeException(e);
        }


        // Code to write in file
//        try {
//            FileWriter fileWriter =new FileWriter("fileOne.txt");
//
//            fileWriter.write("This is our first file from this java course\n"+
//                    "                           ALI ASAD                    \n"+
//                    "       ____________|Personal information|___________    \n"+
//                    "Address; Street1,lane 4,Lahore                         \n"+
//                    "Phone:03456526272                                       \n");
//            fileWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        // read from file
        try {
            Scanner input = new Scanner(myFile);
            while(input.hasNextLine()){
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}