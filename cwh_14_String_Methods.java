public class cwh_14_String_Methods {
    public static void main(String[] args) {
        String name = "Samarth";
        int value = name.length();
       //System.out.println(value);
       // String lsString = name.toLowerCase();
        //System.out.println(lsString);
//       // System.out.println(usString);
       // String nonTrimmedString =   "     Sam    ";
        //System.out.println(nonTrimmedString);
       // String TrimmedString =   "     Sam    ";
       // System.out.println(nonTrimmedString.trim());

        //System.out.println(name.substring(1));
        //System.out.println(name.substring(1,3));
        System.out.println(name.replace('s','o'));
        System.out.println(name.replace("s" ,"bh"));
        System.out.println(name.startsWith("z"));
        System.out.println(name.endsWith("m"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("s"));
        String modifidename = "samartHh";
        System.out.println(name.indexOf("sam", 3 ));
        System.out.println(name.equals("sam"));
        System.out.println(name.equalsIgnoreCase("samrth "));
        System.out.println(" i am samarth \" sjsjkdkd");
        System.out.println(" i m samagruf \n skslkl");
        System.out.println(" duhndkcm \t jsjhnjkkj");
    }

}
