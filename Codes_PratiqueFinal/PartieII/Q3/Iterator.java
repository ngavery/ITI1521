

public interface Iterator<E>{
// renvoie true s'il existe encore un élément à parcourir
  public boolean hasNext();
// renvoie l'élément courant et passe au suivant
  public E next();
}