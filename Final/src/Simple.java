public class Simple {
    int num1;
    int num2;

    void add(){
        System.out.println(num1 + num2);
    }

    void sub(){
        System.out.println(num1 - num2);
    }
    void mul(){
        System.out.println(num1 * num2);
    }
    void div(){
        System.out.println(num1 / num2);
    }
}

class Verified extends  Simple{
    Verified(){

    }


    @Override
    void add() {
        if(num1 < 0 && num2<0){
            System.out.println("Error");
        }
        else{
            super.add();
        }
    }

    @Override
    void sub() {
        if(num1 < 0 && num2<0){
            System.out.println("Error");
        }
        else{
            super.sub();
        }
    }
    @Override
    void mul() {
        if(num1 < 0 && num2<0){
            System.out.println("Error");
        }
        else{
            super.mul();
        }
    }

    @Override
    void div() {
        if(num1 < 0 && num2<0){
            System.out.println("Error");
        }
        else{
            super.div();
        }
    }

}