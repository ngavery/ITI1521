class Test {
    public static void main( String[] args ) {

        Union u1, u2, u3 ;
        u1 = new Union ( 1 , 2 , 3 ) ;
        u2 = new Union (1 , 2 , 3 ) ;
        u3 = new Union (3 , 2 , 1 ) ;
       
         System.out.println ( u1 ) ;
        
         System.out.println ( u1.equals(u2) ) ;
         System.out.println ( u1.equals(u3) ) ;
        
      }

}
