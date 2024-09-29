public abstract class Sha {
    int lines;
    String color;
      abstract void draw();
}

class Cir extends Sha{
    Cir(){

    }
    void draw()
    {
        System.out.println("Curcle drwan");
    }
}

class Tri extends  Sha{
    Tri(){

    }
    void draw(){
        System.out.println("Tri drawn");
    }
}

class sq extends  Sha{
    sq(){

    }
    void draw(){
        System.out.println("sq drwan");
    }
}

class M{
    public static void main(String[] args) {
        sq s = new sq();
        s.draw();
    }
}