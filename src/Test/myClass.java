package Test;
public class myClass
{
    class Inner
    {
        String str;
        public Inner(String str)
        {
            this.str = str;
        }
    }
    public static void main(String [] args)
    {
        myClass mc = new myClass();
        myClass.Inner in = mc.new Inner("Samar");
        System.out.println(in.str);
    }
}