
/***************************Exemple1 LAB3************************/

public class Use {

    public static String[] replace( String[] tabIn, String[] tab, String[] tabOut ) {

        String[] out = null; // Le nouveau tableau à renvoyer 
        boolean ok = true; // True si les pre-conditions sont satisfaites

 // Tester les pre-conditions

 if (tabIn == null || tab == null || tabOut == null ) {
     ok = false;
 } 
 else {
     for ( int i=0; ok == true && i<tabIn.length; i++ ) {
       if ( tabIn[ i ] == null ) {
         ok = false;
       }
  }
     if ( ok ) {
       if ( tab.length != tabOut.length ) {
         ok = false;
       } 
       else {
      for ( int i=0; ok == true && i<tab.length; i++ ) {
        if ( tab[ i ] == null || tabOut[ i ] == null ) {
          ok = false;
        }
      }
    }
 }
 }

 if ( ok ) {
     out = new String[tabIn.length];
     for ( int i=0; i<tabIn.length; i++ ) {
     boolean found = false;
     for ( int j=0; ! found && j<tab.length; j++ ) {
      if ( tabIn[ i ].equals( tab[ j ] ) ) {
        out[ i ] = tabOut[ j ];
        found = true;
      }
     }
     if ( ! found ) {
      out[ i ] = tabIn[ i ];
     }
   }
 }
        return out;
    }

}
