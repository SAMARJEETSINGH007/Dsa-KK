package Chapter3;

import java.util.ArrayList;

public class Test {
    public static void print()
    {
        ArrayList<Integer> ls = new ArrayList<Integer>(11);
        ls.add(11);
        ls.add(12);
        ls.add(20);
        System.out.println(ls.indexOf(1));
        System.out.println(ls.toString());
        //ls.indexOfRange()
    }
    public static void main(String [] args)
    {
        print();
    }
}
