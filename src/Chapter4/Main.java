package Chapter4;
public class Main
{
    public static void main(String[] args)
    {
//        myDoublyLinkedList dll1 = new myDoublyLinkedList();
//        Scanner sc = new Scanner(System.in);
//        dll1.insertFirst(44);
//        dll1.insertFirst(33);
//        dll1.insertFirst(22);
//        dll1.insertFirst(11);
//        dll1.display();
//        dll1.insertLast(55);
//        dll1.display();
//        dll1.insertAtPos(0,3);
//        dll1.display();
//        dll1.reverse();
//        int i=dll1.deleteFirst();
//        System.out.println(i);
//        dll1.display();
//        System.out.println(dll1.deleteLast());
//        dll1.display();
//        System.out.println(dll1.deleteAtPos(2 ));
//        dll1.display();
        myCircularLinkedList cll=new myCircularLinkedList();
        cll.insertFirst(10);
        cll.insertFirst(20);
        cll.insertFirst(30);
        cll.insertFirst(40);
        cll.display();
        cll.insertLast(-1);
        cll.display();
        cll.insertAtPos(-2,2);
        cll.display();
        System.out.println(cll.deleteFirst());
        cll.display();
        System.out.println("deleted element"+cll.deleteLast());
        cll.deleteLast();
        cll.display();
        System.out.println(cll.deleteAtPos(5));
        cll.display();
    }
}