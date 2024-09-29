public class Java_Strings_Practice {
    public static void main(String[] args) {
        //String name = new String("MUZDALFA");
//        String name = "MUZDALFA";
//        System.out.println(name);
//        int a = 7;
//        float b = 5.4343f;
//        System.out.printf("The valur of a is % d and value of b is %8.2f", a, b);
//        System.out.format("The valur of a is % d and value of b is %f ", a, b);
//        Scanner input = new Scanner(System.in);
//        String st  = input.next();
//        System.out.println(st);

          String name  = "Muzdalfa";
//        int value = name.length();
//        System.out.println(value);
//
//        String var1 = name.toUpperCase();
//        System.out.println(var1);
//
//        String nonTrimmedString = "      Muzdalfa is girl.";
//        System.out.println(nonTrimmedString);
//
//        System.out.println(nonTrimmedString.trim());

//          System.out.println(name.substring(1));
//          System.out.println(name.substring(2,6));
//          System.out.println(name.replace('u','z') );
//          System.out.println(name.replace("Muzdalfa","ASMA"));
//          System.out.println(name.startsWith("U"));
//          System.out.println(name.endsWith("Muzdalfa"));
//          System.out.println(name.charAt(2));
//          System.out.println(name.indexOf("a"));
//          String modiName = "Harryrry";
//          System.out.println(modiName.indexOf("rry"));
//          System.out.println(modiName.indexOf("yyyrry", 4));
//          System.out.println(modiName.lastIndexOf("rry", 4));
//          System.out.println(name.equals("Mazdalfa"));
//          System.out.println(name.equalsIgnoreCase("MUZDALFKLA"));
//          System.out.println("I am escape sequence \\ double quote");

        // problem 1
        String nam = "Jack Parker";
        System.out.println(nam.toLowerCase());

        // problem 2
        String text = "To lower case";
        System.out.println(text.replace(" ", "_"));

        // problem 3
        String lop = "Dear <|name|> , Thanks a lot";
        lop = "Dear <|name|>, \nThanks a lot";
        System.out.println(lop.replace("<|name|>", "Muzdalfa"));

        // PROBLEM 4
        String spaces = "Muzdalfa is learning  java  script";
        System.out.println(spaces.indexOf("  "));
        System.out.println(spaces.indexOf("   "));

        // problem 5
        String letter = "Dear Muzdalfa,\n\tThis is java course.\nThanks";
        System.out.println(letter);



    }
}
