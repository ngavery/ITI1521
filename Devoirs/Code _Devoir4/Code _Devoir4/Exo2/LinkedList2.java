
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
   static Node reverse( Node head ) {
   Node prev = null;//initialiser un pointeur au node precedant
   Node current = head;
   Node next = null;
   while (current != null) {//Traverson jusqua la fin de la liste
      next = current.next;//guardons le prochain node du node present avant de changer le pointeur
      current.next = prev; //reversons le prochain pointeur au node present
      prev = current;//bouger le pointeur precedant au node present     
      current = next;//bouger le pointeur present au prochain node
   }
    return prev; // Return the new head of the reversed list
}
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
 static int count( Node head ) {//
   int count_zeros=0;//initialissons le compte de 0
   while(head!=null)//traverse la liste jusqua temp quon arrive a la fin
   {
   if(head.value==0)//verifions si la valeur du node present est 0
   {
   count_zeros++;//incrementons
   }else{
   int num=head.value;//chechons la valeur du node
   String st=Integer.toString(num);//faisons une conversion a string
   int len=st.length();//cherchons la longueur du string
   while(len-->0){
   int d=num%10;//chrchons le dernier chiffre
   num=num/10;//enlevon le dernier chiffre
   if(d==0){
   count_zeros++;
   }
   }
   }
   head=head.next;
   }
   return count_zeros;
   }
 /**
    * Return the number of zeros that occur in a given linked list of int.
    * Uses recursion 
    */
 static int countRecursive( Node head ) {
   if(head==null)//fin de la liste est atteinte
{
   return 0;
}
if(head.value==0)
{
   return (1+countRecursive (head.next));//incrementons count par 1 
}
return (zeros_count(head.value)+countRecursive(head.next));
} // end of countRecursive()
   public static int zeros_count(int num)
{
   String st=Integer.toString(num);//convertissons le nombre a un string
   int len=st.length();//cherchons la longueur du string
   int count=0;//intializons count a 0
   while(len-->0){//pass a travers chaque chiffre
      int d=num%10;//cherchons le dernier chiffre
      num=num/10;//enlevons le dernier chiffre
      if(d==0){
      count++;//incrementons
      }
      }
      return count;
}
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
