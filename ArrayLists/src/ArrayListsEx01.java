// Sample program showing implementation of arrayList.
import java.util.ArrayList;
public class ArrayListsEx01 {

    public static void main(String[] args){

        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println(al.size());
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al.size());
        System.out.println(al);
        al.add(1, 15);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.contains(15));
        al.remove(1);
        System.out.println(al);
        System.out.println(al.contains(15));
        System.out.println(al.remove(Integer.valueOf(10)));
        System.out.println(al);

        System.out.println(al.get(1));
        al.set(1, 40);
        System.out.println(al.get(1));
        al.add(20);
        System.out.println(al);
        System.out.println(al.indexOf(20));
        System.out.println(al.lastIndexOf(20));
        System.out.println(al.indexOf(10));

        System.out.println(al.isEmpty());
        al.clear();
        System.out.println(al.isEmpty());




    }
}
