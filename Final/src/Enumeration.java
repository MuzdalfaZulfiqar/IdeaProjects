import javax.management.ObjectName;

public interface Enumeration {
    public boolean hasNext(int index);
    public Object getNext(int index);
}

class Names implements Enumeration{
    String [] names = new String[100];
    Names(){
        for(int i = 0;i< names.length;i++){
            names[i] = null;
        }
    }
    Names(String [] s){
        names = s;
    }

    public boolean hasNext(int index){
        if(names[index] != null){
            return true;
        }
        else{
            return false;
        }
    }
    public Object getNext(int index){
        if(hasNext(index)){
            String s = names[index];
            Object o = (Object) s;
            return o;
        }
        else {
            System.out.println("Not present");
            return  null;
        }
    }
}

class EnumCheck{
    public static void main(String[] args) {

        String [] s = new String[10];
        Names n = new Names(s);
        s[0] = "Muz1";
        s[1] = "Muz2";
        s[2] = "Muz3";
        s[3] = "Muz4";
        s[4] = "Muz5";
        s[5] = null;
        s[6] = null;

        n.names = s;

        for(int i = 0;i<s.length;i++){
            if(n.hasNext(i)){
                System.out.println((String) n.getNext(i));
            }
        }

    }
}