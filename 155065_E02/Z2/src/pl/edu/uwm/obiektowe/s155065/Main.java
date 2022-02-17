package pl.edu.uwm.obiektowe.s155065;
import java.util.*;

public class Z2 {

    public static <E> void wypiszCoDrugi(Iterable<E> obiekt)
    {
        Iterator<E> it = obiekt.iterator();
        for(int j=0; it.hasNext(); j++)
        {
            System.out.print(it.next());
            if(it.hasNext())
                it.next();
                if(it.hasNext())
                    System.out.print(",");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        ArrayList<Character> lista1 = new ArrayList<>(List.of(new Character[]{'1', '2', '3', '4', '5', '6'}));
        TreeSet<Character> lista2 = new TreeSet(lista1);
        LinkedList<Character> lista3 = new LinkedList<>(lista1);
        wypiszCoDrugi(lista1);
        wypiszCoDrugi(lista2);
        wypiszCoDrugi(lista3);
    }
}
