
/**
 * LinkedList1 class. 
 */
public class LinkedList1 {

    /** 
     * The nested class Node.  
     */
    private static class Node {
        String value;   
        Node next;                         
    }

    // Instance variable
    /**
     *  A pointer to the first node in the linked list. 
     *  If the list is empty, the value is null. 
     */  
    private Node head;  
    
    
    /**
     * Searches the list for a specified item.  
     * @param searchItem the item that is to be searched for
     * @return true if searchItem is one of the items in the list or false if not
     */
    public boolean find(String obj) {

        //VOTRE CODE VIENT ICI

    } // end of find()


    /**
     * Remove a specified item from the list, if that item is present.
     */
    public boolean remove(String obj) {

        if ( head == null ) {
                // The list is empty.
       // VOTRE PREMIER MORCEAU DU CODE VIENT ICI 
        }
         
       // VOTRE DEUXIEME MORCEAU DU VIENT ICI
        

    } // end of remove()


    /**
     * Add a specified item to the list, keeping the list in order.
     * 
     */
    public void add(String obj) {

        Node newNode;          // A Node to contain the new item.
        newNode = new Node();
        newNode.value = obj;  // newNode.next is null.

        if ( head == null ) {
                // The new item is the first (and only) one in the list.
       // VOTRE PREMIER MORCEAU DU CODE VIENT ICI 
        }
        
       // VOTRE DEUXIEME MORCEAU DU CODE VIENT ICI
        
        

    }  // end of add()


    /**
     * Returns an array that contains all the elements in the list.
     * If the list is empty, the return value is an array of length zero.
     */
    public String[] getList() {
         String[] elements;  // An array to hold the list elements.

        /* First, go through the list and count the number
         * of elements that it contains.
         */ 
        
       // VOTRE PREMIER MORCEAU DU CODE VIENT ICI
       

        /*
         * Create an array just large enough to hold all the
         * list elements.  Go through the list again and
         * fill the array with elements from the list.
        */
        
        //VOTRE DEUXIEME MORCEAU DU CODE VIENT ICI

    } // end of getList()

 
} // end of LinkedList1 class
