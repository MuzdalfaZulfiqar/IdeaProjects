public class Java_Oop_Exception_Handling {
    public static void main(String[] args) {
        // Checked Exception (Compile time exception): Detected by compiler and asked to handle it before compiling
        // Example in threads we tried Thread.sleep() method and handled InterruptedException
        // Non-Checked Exception(Runtime exception) :

        //  Number format exception is the one which occurs when you try to convert something in a number
        // which cannot be converted like here we try to convert the string muz in integer but got an exception.

// 1- Number Format Exception.
        /* Exception in thread "main" java.lang.NumberFormatException: For input string: "muz"
	    at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	    */
//        String s = "muz";
//        int i  = Integer.parseInt(s);


// 2- Arithmetic Exception
        int a = 6000;
        int b=0;

        //  Without try
//        int c = a / b;
//        System.out.println("Result "+ c);

        //  With try
        try {
            int c = a / b;
            System.out.println("Result "+ c);
        }
        catch (Exception e){
            System.out.println("We failed to divide. Reason: "+e.toString());
        }
        System.out.println("End of program");


    }

    }

