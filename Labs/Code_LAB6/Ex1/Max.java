
public class Max { 
  public static <T extends Comparable<T> > T maxi (T[] tab) { 
T maxElement = tab[0];
  for(int i = 0; i < tab.length;i++){
    if (tab[i].compareTo(maxElement) > 0) {
      maxElement = tab[i];
    }
  }
  return maxElement;

  }
}


