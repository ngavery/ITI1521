
public class Test {
    public static void main(String [] args){
        MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
        myList.addFirst(new Integer (10));
        myList.addFirst(new Integer (4));
        myList.addFirst(new Integer (14));
        myList.addLast(new Integer (6));
        myList.addLast(new Integer (3));
        myList.addLast(new Integer (1));
        myList.addLast(new Integer (66));
        myList.print();
        System.out.println();
        myList.printReverse();
        System.out.println();
        myList.removeFirst();
        myList.removeLast();
        System.out.println();
        myList.print();
        System.out.println();
        myList.printReverse();
        System.out.println();
    }
}


