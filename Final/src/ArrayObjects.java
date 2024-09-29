import java.util.Scanner;

class Bes{
    int marks;
    int roll;
    String name;

    Bes(){

    }
    public Bes(int marks, int roll, String name) {
        this.marks = marks;
        this.roll = roll;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class ArrayObjects {
    public static void main(String[] args) {
        Bes b [] = new Bes[5];
        Scanner input = new Scanner(System.in);
        for(int i = 0;i<b.length;i++){
            System.out.println("Name");
            String name =  input.next();
            System.out.println("roll");
            int r = input.nextInt();
            System.out.println("marks");
            int m = input.nextInt();
            Bes b1 = new Bes(m,r,name);
            b[i] = b1;
        }

        for(int i= 0;i<b.length-1;i++){
            for(int j = 0;j<(b.length-1)-i;j++){
                if(b[i].marks <b[j].marks){
                    Bes temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }

        for(int i = 0;i<b.length;i++){
            System.out.println(b[i].name + " " + b[i].marks);
        }
    }
}
