
// Static methods are those which are not associated to object it is associated to class or interfaces,
// why with interfaces because we can make reference of them

// Default methods allow to update and add new functionality to existing interfaces
// it is not allowed to make changes to interfaces because due to that we have to make changes to the whole
// classes which will be implementing it ,so we make the methods default in interface and also define them in interface
//we will not have to implement in every derived class

// we can access the default method using object just like others
// we can overRide the same default method in child class and in that case the method in the child class
// will be implemented
public class oop_Default_Methods_Interfaces_Implementation {
    public static void main(String[] args) {
        smartPhone sm = new smartPhone();
        String [] ar = sm.getNetwork();


        // yaani ke agar aik dost khy ke ussy camera chahiye to hum smartphone main se uss ko
        // camera khol ke dyn go iss waja se hum actual main dy to smartphone rhy hain lakin
        // uss ko camera ke reference se use kiya ja raha ha lehaza wo sirf camera se relevant
        // functionalities hi perform kry ga

        camera wi = new smartPhone();

        sm.record();
        //sm.greet();--error since private
        for(String  ep : ar){
            System.out.println(ep);
        }

    }
}
interface camera{
    void takeSnap();
    void recordVideo();

    // we will face a problem that we cannot use this private method in child class
    // we can use this by calling in the default method since all the other classes can have
    // access to the default method and hence they can use this private method
    private void greet(){
        System.out.println("Good morning...");
    }
    default void record(){
        greet();
        System.out.println("Recording 4k");
    }
}

interface wifi{
    String [] getNetwork();
    void connectToNetwork(String network);
}
class cellPhone{
    void callNumber(int phone){
        System.out.println("Calling : "+ phone);
    }
    void pickNumber(){
        System.out.println("Picking...");
    }

}
class smartPhone extends cellPhone implements wifi,camera{

    public void recordVideo(){
        System.out.println("Recording video..");
    }
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public String [] getNetwork(){
        System.out.println("Setting list of networks:");
        String [] networkList = {"Muzdalfa","Asad1234"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to network");
    }


}