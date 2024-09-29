public interface AnimalInterface {
    public void bark();
}
class Dog implements AnimalInterface{
    public void  bark(){
        System.out.println("Barking");
    }
}
