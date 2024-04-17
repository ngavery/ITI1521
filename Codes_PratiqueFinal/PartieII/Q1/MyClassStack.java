
public class MyClassStack implements MyStack {
/**
    * An object of type Node holds one of the items in the linked list 
    * that represents the stack.
    */
   private static class Node {
      int  value;
      Node next;
   }
   //Instance variable
   private Node top;  // Pointer to the Node that is at the top of
                      //   of the stack.  If top == null, then the
                      //   stack is empty.
   
  //Constructor
   public  MyClassStack(){
      top = null;
   }
   //Instance methods
   /**
    * Add elem to the top of the stack.
    */
   public void push( int   elem ) {
      Node newTop;         // A Node to hold the new item.
      newTop = new Node();
      newTop.value = elem;     // Store elem in the new Node.
      newTop.next = top;   // The new Node points to the old top.
      top = newTop;        // The new item is now on top.
   }
   
   /**
    * Remove the top item from the stack, and return it.
    * Throws an IllegalStateException if the stack is empty when
    * this method is called.
    */
   public int pop() {
      if ( top == null )
         throw new IllegalStateException("Can't pop from an empty stack.");
      int topItem = top.value;  // The item that is being popped.
      top = top.next;          // The previous second item is now on top.
      return topItem;
   }
   
   /**
    * Returns true if the stack is empty.  Returns false
    * if there are one or more items on the stack.
    */
   public boolean isEmpty() {
      return (top == null);
   }

   /**
    * Returns the top item of the stack, without removing it. 
    */
   public int peek ( ) {
     int elem ;
     elem = this.pop ( ) ;
     push ( elem ) ;
     return elem ;
   }

/** 
 *returns the number of items in the stack. 
 */
   public int count ( ) {
      int count = 0;
      while (!isEmpty()) {
         count++;
      }
      return count;
}

/*
 *Reverses the order of the items in the stack 
 *(that is, keeps the same items, but reverses the order of them in the stack.)  
 */
   public void reverse ( ) {
   MyStack temp1 = new MyClassStack();
   MyStack temp2 = new MyClassStack();

   while (!isEmpty()) {
      temp1.push(pop());
      temp2.push(temp1.pop());
   }
   }
}//end of MyClassStack 


