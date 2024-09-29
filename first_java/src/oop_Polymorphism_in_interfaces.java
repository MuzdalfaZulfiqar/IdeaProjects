public class oop_Polymorphism_in_interfaces {
    public static void main(String[] args) {

        MYcamera my = new MYsmartPhone();

        // since we are using smartphone as a reference of camera, so we can only use
        // the methods of camera are allowed
        my.recordVideo();
        my.takeSnap();
        my.record();

        // this is the method of the child class smartphone we cannot use this
        // because we are restricted to use only the methods of camera
        // my.thisClassMeth();
        // my.connectToNetwork("PO");// not allowed

        MYsmartPhone msm = new MYsmartPhone();// can use all methods of smartphone
        // which include class cellPhone methods interface camera and wifi methods
        // and also its own methods

        msm.connectToNetwork("op");
    }
}
interface MYcamera{
    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("Good morning...");
    }
    default void record(){
        greet();
        System.out.println("Recording 4k");
    }
}
interface MYwifi{
    String [] getNetwork();
    void connectToNetwork(String network);
}
class MYcellPhone{
    void callNumber(int phone){
        System.out.println("Calling : "+ phone);
    }
    void pickNumber(){
        System.out.println("Picking...");
    }

}
class MYsmartPhone extends MYcellPhone implements MYwifi,MYcamera{

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


    public void thisClassMeth(){
        System.out.println("thisClassMeth");
    }
}
