import java.util.NoSuchElementException;

public class CircularQueue<E> implements Queue<E> {
private static final int DEFAULT_CAPACITY = 100;
private int front, rear, size;
private E[] elems;

public CircularQueue(int capacity) {
elems = (E[]) new Object[capacity];
front = 0;
rear = -1;
size = 0;
}


 private class CircularQueueIterator implements Iterator<E> {
     private int current = front;
     private int count = 0;
     
     public E next() {
    //S'il n'y a plus d'éléments à itérer sur (si on a déjà traversé toute la liste auparavant).
      if (!hasNext()) {
      throw new NoSuchElementException(); 
      }
      E element = elems[current];
      current = (current + 1) % elems.length; //Incrément au prochain élément, retourne au début si on atteint le dernier élément.
      count++;
      return element;
     }
     
     public boolean hasNext() {
        return count < size; //Retourne true si on n'a pas traversé toute la liste (alors l'élément actuel a un prochain).
        }
     }
 // End of CircularQueueIterator

 public Iterator<E> iterator() {
     return new CircularQueueIterator();
 }

 public boolean isEmpty() {
  return ( size == 0 );
 }
 public void enqueue( E value ) {
  rear = ( rear+1 ) % elems.length;
  elems[ rear ] = value;
  size++;
 }

 public E dequeue() {
     E save = elems[ front ];
     elems[ front ] = null; 
     size--;
     front =  ( front+1 ) % elems.length;
     return save;
 }

 public String toString() {

     StringBuffer str = new StringBuffer( "[" );

     if ( size > 0 ) {

  int offset = 0;

  str.append( elems[ front ] );
  offset = offset + 1;

  while ( offset < size ) {
      
      str.append( ", " );
      str.append( elems[ ( front + offset ) % elems.length ] );
      offset = offset + 1;

  }

     }

     str.append( "]" );

     return str.toString();

 }
}
// End of CircularQueue
