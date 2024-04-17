import java.util.NoSuchElementException;
public class MyLinkedList<E> {

/*Instance variables*/
private Node head;
private Node tail;
private int size;

/*Constructor*/
public MyLinkedList() {
size = 0;
}

/**
* Nested Node class  
*/
private  class Node {
E value;
Node next;
Node prev;
public Node(E value, Node next, Node prev) {
this.value = value;
this.next = next;
this.prev = prev;
}
}

/*Instance methods*/

/**
* returns the size of the linked list
* @return
*/
public int size() { 
  return size; 
}

/**
 ** return whether the list is empty or not
* @return
*/
public boolean isEmpty() { 
  return size == 0; 
 }

/**
* adds element at the starting of the linked list
* @param element
*/
public void addFirst(E element) {
Node tmp = new Node(element, head, null);
if(head != null ) {
  head.prev = tmp;
}
head = tmp;
if(tail == null) { 
  tail = tmp;
}
size++;
}

/**
* adds element at the end of the linked list
* @param element
*/
public void addLast(E element) {
Node tmp = new Node(element, null, tail);
if(tail != null) {
  tail.next = tmp;
}
tail = tmp;
if(head == null) { 
  head = tmp;
}
size++;
}

/*** prints the elements of the linked list */
public void print(){
//VOTRE CODE ICI
}//end of print

/*** prints the elements of the linked list in the reverse order*/
public void printReverse(){
//VOTRE CODE ICI
}//end of printReverse


/**
* removes element from the start of the linked list
* @return
*/
public E removeFirst() {
if (size == 0) throw new NoSuchElementException();
Node tmp = head;
head = head.next;
head.prev = null;
size--;
System.out.println("deleted: "+tmp.value);
return tmp.value;
}


/**
* removes element from the end of the linked list
* @return
*/
public E removeLast() {
if (size == 0) throw new NoSuchElementException();
Node tmp = tail;
tail = tail.prev;
tail.next = null;
size--;
System.out.println("deleted: "+tmp.value);
return tmp.value;
}

}