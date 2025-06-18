package Chapter5;
public class Main
{
    public static void main(String[] args)
    {
        myHashtable table = new myHashtable(5);
        table.put(1,"Samar");
        table.put(11,"Sristhi");
        table.put(999,"Amit");
        table.put(999,"amar");
//        table.display();
//        System.out.println(table.isEmpty());
//        System.out.println(table.returnSize());
        table.get(1);
        System.out.println(table.remove(1));
        System.out.println(table.remove(11));
        System.out.println(table.remove(999));
        table.display();
    }
}
