public class ObjectPass {
    int value = 2;
    public static void inc(ObjectPass p){
        p.value++;
    }

    public static void main(String[] args) {
        ObjectPass p = new ObjectPass();
        System.out.println(p.value);
        ObjectPass.inc(p);
        System.out.println(p.value);
    }
}
