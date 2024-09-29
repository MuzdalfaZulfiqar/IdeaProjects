import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Contact> array = new ArrayList<Contact>();
//        Contact c = new Contact("muz","Zul","",1234);
//        Contact c1 = new Contact("muz1","Zul1","",1234);
//        Contact c2 = new Contact("muz","Zul","",1234);
//        Contact c3 = new Contact("muz","Zul","",1234);
//        array.add(c);
//        array.add(c1);
//        array.add(c2);
//        array.add(c3);
//
//       for(Contact p: array){
//           p.display();
//       }
//
//        array.remove(c1);
//        for(Contact p: array){
//            p.display();
//        }
//
//        array.remove(0);
//        System.out.println(array.size());
//
//        int a = search(c, array);
//        if(a != -1){
//            System.out.println(c.f);
//        }
//        else{
//            System.out.println("Contact not found");
//        }
//
//        Contact cp = searchContact("muz111",array);
//        if(cp!=null){
//            cp.display();
//        }
//        else{
//            System.out.println("Not found");
//        }

//        System.out.println("Enter the degree of difficulty..");
        Scanner input = new Scanner(System.in);
//        double degree = input.nextDouble();
//
//        ArrayList<Double> a = new ArrayList<Double>();
//        for(int i = 0;i<7;i++){
//            System.out.println("Enter the score of j "+(i+1));
//            double s = input.nextDouble();
//            a.add(s);
//        }
//
//        System.out.println(a.size());
//
//        a.remove(6);
//        a.remove(0);
//
//        double scoresum = 0.0;
//        for(Double d : a)
//        {
//             scoresum = scoresum + d;
//        }
//
//        scoresum = degree * scoresum;
//
//        scoresum = scoresum * 0.6;
//
//        System.out.println(scoresum);

//        int option = input.nextInt();

        ArrayList<Student > st = new ArrayList<>();
//        while (true){
//            Student s;
//            s = new Student();
//            s.name = input.next();
//            s.marks = input.nextInt();
//            s.rollNo = input.nextInt();
//            if(s.rollNo<0)break;
//            st.add(s);
//        }
//
//        for (Student k: st
//             ) {
//k.display();
//        }
//
//
//        for(int i = 0;i<st.size()-1;i++){
//            for(int j = 0;j< st.size();j++){
//                if(st.get(i).marks > st.get(j).marks){
//                    Student swap = st.get(i);
//                    st.set(i, st.get(j));
//                    st.set(j , swap);
//                }
//            }
//        }
//
//        for (Student k: st
//        ) {
//            k.display();
//        }

        System.out.println("Add student data ");
        Student s = new Student(1, "mib",11);
        Student s1 = new Student(1, "mib",11);
        Student s2 = new Student(1, "mib",11);
        st.add(s);
        st.add(s1);
        st.add(s2);

        for (Student k: st
        ) {
            k.display();
        }
        System.out.println("Delete student data");
        st.remove(0);

        for (Student k: st
        ) {
            k.display();
        }


        System.out.println("Find record");
        String n = "Muz";
        for(Student s11: st){
            if(s11.name.equals("mi")){
                System.out.println("Data found");
            }
        }

        System.out.println("Not found");

        System.out.println("Update record");
        Student sp =new Student(1, "roll",11);
        for(int i = 0;i<st.size();i++){
            if(st.get(i).name.equals("mib")){
                System.out.println("Data found");
                st.get(i).name = "mz";
                st.set(i,sp);
            }
        }

        for (Student k: st) {
            k.display();
        }

//        st.clear();
//        System.exit(1);
//

    }

    public static  int search(Contact c, ArrayList<Contact> arr){
        for(Contact p: arr){
            if(p.f.equals(c.f)){
                return 1;
            }

        }
        return -1;
    }


    public static Contact searchContact(String s, ArrayList<Contact> arr){
        for(Contact a: arr) {
            if (a.f.equals(s) || a.l.equals(s) || a.email.equals(s)) {
                return a;
            }
        }
        return null;
    }
}

class Student {

    int rollNo;
    String name;
    int marks;
    Student(){

    }

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public void display(){
        System.out.println("Name : "+ name);
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Marks : "+marks);
    }
}// Student class ends here
