

public class ListNode implements InterfaceNode {

    // Implementation of the doubly linked nodes (nested-class)

    private static class Node {

 private Comparable value;

 private Node prev;  	//for the previous node
 private Node next;	//for the next node

 private Node ( Comparable value, Node prev, Node next ) {
     this.value = value;
     this.prev = prev;
     this.next = next;
 }
    }

    // Instance variables
    private Node head;

    // Empty list.
    public ListNode() {
     // a dummy node is created
        head = new Node(null, null,null);
        head.next = head;
        head.prev = head;
    }

     // Instance methods
       public int size() {
 throw new UnsupportedOperationException( "error!" );
    }
  
    
    public Object get( int pos ) {
 throw new UnsupportedOperationException( "error!" );
    }

    public boolean add( Comparable o ) {
 throw new UnsupportedOperationException( "error!" );
    }

    public void remove( int pos ) {
 throw new UnsupportedOperationException( "error!" );
    }
}
