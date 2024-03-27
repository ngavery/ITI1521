
class Test5_2 {

    public static void main( String[] args ) {

    ListNode node = new ListNode();
    if ( node.size() != 0 )
     System.out.println( "List not empty " );
    
    for ( int i=1; i<=10; i++ ) { // add 
     node.add( new Integer( i ) );

     if ( node.size() != i )
       System.out.println( "size # " + i );
 }


  System.out.println( "Elements values of my list are : " );    
 /*print*/
 for ( int i=0; i<10; i++ ) {
     int m = ( (Integer) node.get( i ) ).intValue();
          
     System.out.println( " Element at position " +i  +" is " +m ); 
}
     System.out.println( "add tested " );



/*remove*/
 for ( int i=0; i<10 && node.size() > 0; i++ ) {
     int m = ( (Integer) node.get( 0 ) ).intValue();
     node.remove( 0 );
}
  
 System.out.println( "size is " + node.size());
 System.out.println( "remove tested!" );
   
   
 /*add */
 for ( int i=10; i>=1; i--  ) { // add 
     node.add( new Integer( i ) );

     if ( node.size() != 10 - i + 1 )
       System.out.println( "size # " + i );
 }
 
 /**merge**/
 ListNode node2 = new ListNode();

        for ( int i=1; i<10; i=i+2 ) {
            node2.add( new Integer( i ) );
        }

        node.merge( node2 );
     
        System.out.println("===========================================");
        System.out.println("after merging, elements are : ");
        for ( int i=0; i<15; i++ ) {
            int m = ( (Integer) node.get( i ) ).intValue();
      
                System.out.println(m);
     
        }
 System.out.println( "merge tested!" );
    }
}
