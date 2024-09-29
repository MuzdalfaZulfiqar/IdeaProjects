public class Tape extends Publication {
    protected int playingTime;

    Tape(){
        super();
        playingTime = 0;
    }
    Tape(String title, int price, int playingTime){
        super(title,price);
        this.playingTime = playingTime;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }
    public void display(){
        super.display();
        System.out.println("Playing Time : "+ playingTime);
    }
}
