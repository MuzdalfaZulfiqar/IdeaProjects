

public class TestClass {
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    int year;
    TestClass(){

    }
    TestClass(int age , int year){
        age = this.age;
        year = this.year;
    }


}


//class childClass extends TestClass{
////    public static  void check(){
////        System.out.println("C_ Method");
////    }
//}
