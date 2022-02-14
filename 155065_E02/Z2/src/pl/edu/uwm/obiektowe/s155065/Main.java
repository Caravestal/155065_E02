package pl.edu.uwm.obiektowe.s155065;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static <E> void wypiszCoDrugi(Iterable<E> it)
    {
        StringBuffer buf = new StringBuffer();
        it.forEach(i -> buf.append(i.toString()));
        for(int i=0; i<buf.length(); i++)
        {
            if(i%2==0)
                buf.setCharAt(i,',');
        }
        buf.deleteCharAt(0);
        if(buf.length() % 2 == 0)
            buf.deleteCharAt(buf.length()-1);
        System.out.println(buf);
    }

    public static void main(String[] args)
    {
        ArrayList<Character> t1 = new ArrayList<>();
        t1.add('@');
        t1.add('#');
        t1.add('$');
        t1.add('%');
        LinkedList<Integer> t2 = new LinkedList<>();
        t2.add(1);
        t2.add(2);
        t2.add(3);
        t2.add(4);
        t2.add(5);
        wypiszCoDrugi(t1);
        wypiszCoDrugi(t2);
    }
}
