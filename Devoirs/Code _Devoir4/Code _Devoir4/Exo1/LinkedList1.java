
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
    Node current = head;
    while(current != null) { //Tant que la liste n'est pas vide...
        if (obj.equals(current.value)) { //On compare les valeur de obj et head.
            return true;
        }
        current = current.next; //On traverse la liste.
    }
       return false;

    } // end of find()


    /**
     * Remove a specified item from the list, if that item is present.
     */
    public boolean remove(String obj) {
        Node current = head; //On initialise "current" pour maintenir la structure de la liste lorsqu'on y traverse.
        
        if (head == null) { //Si la liste est vide...
            return false;
        }
        if (head.value.equals(obj)) {  //Si le premier noeud a la valeur spécifiée...
            head = head.next;
            return true;
        }

        else { 
            while (current!=null) {
                if (current.next.value.equals(obj)) { //Si le prochain noeud a la valeur spécifiée...
                    current.next = current.next.next; //On saute ce noeud.
                    return true;
                }
                else {
                    current = current.next; //Si non, on continue à traverser la liste.
                }
        }
        return false; //La valeur spécifiée n'a pas été retrouvée.
        }
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
            head = newNode; //Si la liste est vide, le nouveau noeud est ajouté.
            return; //On arrête l'exécution de la méthode
        }
        
        Node current = head;
        while (current.next != null) { 
           
            current = current.next; //On traverse la liste.
        }

        current.next = newNode; //On ajoute le nouveau noeud une fois que la liste est entièrement traversée.
            
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
        int counter = 0;
        Node current = head;

        while (current != null) {
            current = current.next;
            counter++;
        }

        /*
         * Create an array just large enough to hold all the
         * list elements.  Go through the list again and
         * fill the array with elements from the list.
        */
        
        current = head; //Réinitialise "current".
        elements = new String[counter];
        int index = 0;

        while (current != null) {
            elements[index] = current.value; //Assigne les valeurs des noeuds aux bonnes positions.
            current = current.next;
            index++;
        }

        return elements;

    } // end of getList()

 
} // end of LinkedList1 class
