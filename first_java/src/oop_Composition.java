// Making member classes and then owner class to which we will store the reference variables
// of the member classes after that we will make the objects of classes in main and pass the
// objects name to the owner class, further we will use the methods of member classes through
// owner class object's get functions which we have made for the usage of the objects of
// member class objects as
// ownerClassObject.getMemberClassObjectMethod.MemberClassFunction

public class oop_Composition {
    public static void main(String[] args) {

        motherBoard mb = new motherBoard("Intel","110M",128);
        Case theCase = new Case("DELLMDF-01","DELL","12");
        PC p = new PC(theCase,mb);

        // for owner class to use the functionalities of member class since the owner class
        // is using objects of member class which are private in the PC class, we will get them
        // first using their get Functions
        p.getMb().laodProgram("Video load");
        p.getTheCase().pressPowerButton();
    }
}

class motherBoard{
    private String model;
    private String manufacturer;
    private int ramSlots;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    motherBoard(String manufacturer, String model, int ramSlots){
        this.manufacturer=manufacturer;
        this.model=model;
        this.ramSlots=ramSlots;
    }

    public void laodProgram(String  p){
        System.out.println("Program loading..."+ p);
    }
}
class Case{
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    private String manufacturer;
    private String powerSupply;


    public Case(String model, String manufacturer, String powerSupply) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
    }
    public void pressPowerButton(){
        System.out.println("Pressing button..");
    }
}

// we cannot inherit multiple classes so composition helps us
class PC{

    // owner class and in this class we will give the reference of the member class objects
    private Case theCase;

    public Case getTheCase() {
        return theCase;
    }

    public void setTheCase(Case theCase) {
        this.theCase = theCase;
    }

    public motherBoard getMb() {
        return mb;
    }

    public void setMb(motherBoard mb) {
        this.mb = mb;
    }

    private motherBoard mb;

    public PC(Case theCase, motherBoard mb) {
        this.theCase = theCase;
        this.mb = mb;
    }

}