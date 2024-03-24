

public class cwh_15_ps {
    public static void main(String[] args) {
        //p1
        String name = "Samarth";
        name = name.toLowerCase();
        System.out.println(name);
        String text =" i am samarth";
        text = text.replace(" " ,"_");
        System.out.println(text);
        String letter = "Dear <|name|> Thanks a lot! ";
        letter =letter.replace("<|name>|" , "Samarth");
        System.out.println(letter);
        String myString = " This string contains   double and tripal  space";
        System.out.println(myString.indexOf("   "));
        System.out.println(myString.indexOf("  "));
        String youString = " This string contains double and tripal  space";
        System.out.println(myString.indexOf("        "));
        System.out.println(myString.indexOf("  "));
        String myLetter = " Dear Samarth, \n\t this is java course. \n\t Thanks";
        System.out.println(myLetter);
    }
}
