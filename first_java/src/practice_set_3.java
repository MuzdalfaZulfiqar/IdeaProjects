public class practice_set_3 {
    public static void main(String[] args) {

        // question #1
        String name = "Muzdalfa Zulfiqar";
        System.out.println(name.toLowerCase());

        // question #2
        String namee = "My name is muzdalfa";
        namee = namee.replace(" ","_");
        System.out.println(namee);

        // question #3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Muzdalfa");
        System.out.println(letter);

        // question #4
        String myString = "This string contains double  and triple spaces   .";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // question #5 (scape sequence)
        String let = "Dear Muzdalfa,\n \t This Java Course is nice. \n \t Thanks";
        System.out.println(let);





    }
}
