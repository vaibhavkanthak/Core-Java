//String class all definitions
public class StringsEx01 {
    public static void main(String[] args) {

        String str = "Vaibhav";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.substring(3));
        System.out.println(str.substring(0, 3));

        String str1 = str.substring(0, 3);
        String str2 = str.substring(3);
        System.out.println(str1 + str2);

        String s1 = "Geeky";
        String s2 = "Geeky";
        if(s1 == s2)
            System.out.println("Yes->Both s1 and s2 string literals represent same object nmaed \"Geeky\"");
        else
            System.out.println("No");
        String s3 = new String("Geeky");
        if(s1 == s3)
            System.out.println("Yes");
        else
            System.out.println("No");

        String s4 = "geekynomaad";
        String s5 = "nomaad";
        System.out.println(s4.contains(s3));
        System.out.println(s1.equals(s2));

        int res = s4.compareTo(s5);
        if(res == 0)
            System.out.println("Same");
        if(res > 0)
            System.out.println("s1 greater");
        if(res < 0)
            System.out.println("s1 smaller");
        System.out.println(s4.indexOf(s5));

        String s6 = s5;
        s5 = "geeky" + s5;
        System.out.println(s5.equals(s6));
        System.out.println(s5 == s6);
        String s7 = "GEEKYNOMAAD";
        System.out.println(s5.equalsIgnoreCase(s7));
        System.out.println(s5.toUpperCase());
        System.out.println(s5.toLowerCase());
        System.out.println(s4);
        int a = 10;
        String s8 = "New";

    }
}