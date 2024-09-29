public class Encap {
    String author;
    String [] chapterNames;
    Encap(){
        author = null;
        chapterNames = new String[100];
    }
    Encap(String a, String s[]){
        author = a;
        chapterNames = s;
    }

    public boolean compareBook(Encap e){
        if(author.equals(e.author)){
            return  true;
        }
        else{
            return false;
        }
    }

    public   Encap compareChapter(Encap e){
        if(this.chapterNames.length >e.chapterNames.length ){
            return this;
        }
        else{
            return e;
        }
    }
}

class kl{
    public static void main(String[] args) {
        String s[] = {"qw","rt","33f"};
        Encap e = new Encap("sd",s);
        String s1[] = {"qw","rt","33f","ss"};
        Encap e1 = new Encap("sd22",s1);

        System.out.println(e.compareBook(e1));
        Encap po = e.compareChapter(e1);
        System.out.println(po.author);

    }
}