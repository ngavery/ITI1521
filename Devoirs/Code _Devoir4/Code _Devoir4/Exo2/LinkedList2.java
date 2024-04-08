
public class LinkedList2 {

   /**
    * Objects of type Node are linked together into linked lists.
    */
   private static class Node {
      int value;        // value of an item in the list.
      Node next;       // Pointer to the next node in the list.
   }
   
   /**
    * Return a new list containing the same items as the list,
    * but in the reverse order.
    */
   static Node reverse( Node obj ) {//reverse le linked list en creeant un nouveau
      Node p = obj;
      Node reverse = null;
      while(p!=null) {
    	  Node newNode = new Node();
    	  newNode.value =p.value;
    	  newNode.next = reverse;
    	  reverse = newNode;
    	  p = p.next;
      }
     return reverse;
     
   } // end of reverse()
   /**
    * Displays the items in the list to which the parameter, first, points.
    * They are printed on one line, separated by spaces 
    */
    static void display(Node first) {
      Node p; // For traversing the list.
      p = first;
      while(p!=null)//traversr jusqua temp que la fin de la liste est atteinte
      {
         System.out.print(p.value+" ");//afficher lavaleur du node present
         p=p.next;//bouger au prochain node dans la liste
      }
      }
   /**
    * Return the number of zeros that occur in a given linked list of int.
    */
 static int count( Node head ) {
   int count = 0;
    Node p = head;
    while (head!= null) {
    	if(head.value == 0) {
    		count ++;
    	}
    	head = head.next;
    }
    return count;
}// end of count()

/**
   * Return the number of zeros that occur in a given linked list of int.
   * Uses recursion 
   */
static int countRecursive( Node head ) {
   if (head == null) {
      return 0;
   }
   if (head.value== 0) {
      return 1+countRecursive(head.next);
   }
   return countRecursive(head.next);
} // end of countRecursive()
   
 /**
    * Return the number of zeros that occur in a given linked list of int.
    * Uses recursion 
    */
   
   public static void main(String[] args) {
   
      Node list = null;   // A list, initially empty.
      Node reverseList;  // The reversed list.
      
      int count = 0;  //The number of elements in the list
      
      while (true) {
         // add a new node onto the head of the list before repeating.      
          count++;
          if (count == 10)
            break;
         Node head = new Node();  // A new node to add to the list.
         head.value = (int)(Math.random()*100);  // A random item.
         head.next = list;
         list = head;
      }
          
         // Print the current list ; its reverse 
         // and the number of zeros in the list using both count methods
         System.out.print("The list: ");
         display(list);
         System.out.println();
         reverseList = reverse(list);
         System.out.print("The reversed list: ");
         display(reverseList);
         System.out.println();
         System.out.println();
         System.out.print("The number of zeros in the list : ");
         System.out.println(count(list));
         System.out.print("The number of zeros in the list, using recursion : ");
         System.out.println(countRecursive(list));
      
   } // end main()
   
} // end LinkedList2 class
