

public interface Iterator<E>{
// renvoie true s'il existe encore un �l�ment � parcourir
  public boolean hasNext();
// renvoie l'�l�ment courant et passe au suivant
  public E next();
}