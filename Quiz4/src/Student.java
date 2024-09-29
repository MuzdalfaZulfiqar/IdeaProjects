public class Student {
    // attributes rno, name and marks
    int rno;
    int marks;
    String name;

    Student(){
        rno = 0;
        marks = 0;
        name = null;
    }
    public Student(int rno, int marks, String name) {
        this.rno = rno;
        this.marks = marks;
        this.name = name;
    }

    public int getRno() {
        return rno;
    }
    public void setRno(int rno) {
        this.rno = rno;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println(name);
        System.out.println(marks);
    }
}