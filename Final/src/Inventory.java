public class Inventory implements  compare{
    String name;
    int id;
    Inventory()
    {

    }
    Inventory(String n, int i){
        name = n;
        id = i;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean Compare(Object o){
        Inventory i = (Inventory) o;
        if(this.name.equals(i.name)){
            return true;
        }
        else{
            return false;
        }
    }


}

interface  compare{
    boolean Compare(Object o);
}

class PT
{
    public static void main(String[] args) {
        Inventory i = new Inventory("MUN", 9);
        Inventory i1 = new Inventory("MUN", 9);
        System.out.println(i.Compare(i1));
    }
}