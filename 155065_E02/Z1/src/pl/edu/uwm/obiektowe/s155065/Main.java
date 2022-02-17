package pl.edu.uwm.obiektowe.s155065;
import java.time.LocalTime;

public class Main {

    public static <T extends Comparable<T>> boolean jestPalindromem(T[] tab)
    {
        for(int i = 0; i < Math.floor((float)tab.length/2); i++)
        {
            if(tab[i].compareTo(tab[tab.length-i-1]) != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Integer tab1[] = {1, 2, 3, 2, 1};
        LocalTime tab2[] = {LocalTime.parse("11:12"), LocalTime.parse("12:11"), LocalTime.parse("12:11"), LocalTime.parse("11:13")};
        System.out.println(jestPalindromem(tab1));
        System.out.println(jestPalindromem(tab2));
    }
}
