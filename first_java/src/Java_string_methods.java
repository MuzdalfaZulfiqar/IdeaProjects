public class Java_string_methods {
    public static void main(String[] args) {
        String name = "Muzdalfa";
        System.out.println(name);

        // #1 length()
        int value = name.length();
        System.out.println(value);

        // #2 tolowercase()
        String lstring = name.toLowerCase();
        System.out.println(lstring);

        // #3 touppercase()
        String ustring = name.toUpperCase();
        System.out.println(ustring);

        // #4 trim() it will remove the spaces
        String nonTrimmedString = "    Muzdalfa    ";
        System.out.println(nonTrimmedString);

        //  trim by creating a new string
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        // trim without creating a new string
        System.out.println(nonTrimmedString.trim());

        // #5 substring()
        // only start index
        // print value starting from user entered index to end
        System.out.println(name.substring(4));


        // start index and end index
        // print value starting from user entered index and the end value will be excluded
        System.out.println(name.substring(3,8));

        // #6 replace()

        String namee = name.replace('d','a');
        System.out.println(namee);
        System.out.println(name.replace("Muzdalfa","Asma"));

        // #7 startswith()
        System.out.println(name.startsWith("M"));
        System.out.println(name.startsWith("Mu"));
        System.out.println(name.startsWith("MUZ"));

        // #8 endswith()
        System.out.println(name.endsWith("A"));
        System.out.println(name.endsWith("a"));

        // #8 charAt() means give the character at the entered index
        // will give error at out of range that is in this case at 8
        System.out.println(name.charAt(7));


        // #9 indexOf() means gives the index of first letter of entered string
        // ----A----
        // it will give the first substring
        System.out.println(name.indexOf("alfa"));
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("asd")); // return -1


        // ----B----
        // it will start reading from the entered index and skip the previous one
        String modifiedName = "Muzdaldalfa";
        System.out.println(modifiedName.indexOf("dal"));
        System.out.println(modifiedName.indexOf("dal",4));

        // #10 lastindex()
        // it will give the last occurrence of the entered string word
        //---A----
        System.out.println(name.lastIndexOf("a"));

        //---B----
        // start counting index from left to right,and then it will search only
        // in that particular string and will give last occurrence
        System.out.println(modifiedName.lastIndexOf("dal",7));


        // #11 equals()
        System.out.println(name.equals("Muzdalfa"));

        // #12 equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("MUZDALFA"));
        System.out.println(name.equalsIgnoreCase("muzdalfa"));
        System.out.println(name.equalsIgnoreCase("MuzdalfA"));
        System.out.println(name.equalsIgnoreCase("Mzadalfa"));


        System.out.println("I am escape sequence\tdouble quote ");








    }
}

