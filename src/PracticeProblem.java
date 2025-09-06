import static java.lang.System.out;
public class PracticeProblem {


    public static void main(String[] args){

        out.println("\nThis is after newline");
        String emoji = "\uD83D\uDE03";
        out.println(emoji);
        out.println("java\u2122");

        String s = "java";
        s = "java1";
        String s1 = s.substring(0, 1);
        out.println(s1);
        out.println(s1 + " ");
        //1
        char[] arr = {'j', 'a', 'v', 'a'};
        out.println(arr);
        //2
        String a = "geeky";
        out.println(a);
        out.println(a.length());
        out.println(a.charAt(3));
        out.println(a.substring(3));
        out.println(a.substring(0, 4));
        //3
        String b = new String("Nomaad");
        out.println(b);
        //4
        StringBuffer sf = new StringBuffer("Geekyway");
        System.out.println(sf);
        //5
        StringBuilder sb = new StringBuilder("Nomaadicway");
        System.out.println(sb);

    }

}
