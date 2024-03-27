class Test3 {

    public static void main( String[] args ) {

    ListNode node = new ListNode();
    if ( node.size() != 0 )
     System.out.println( "List not empty " );
    
    for ( int i=1; i<=10; i++ ) { // add 
     node.add( new Integer( i ) );

     if ( node.size() != i )
       System.out.println( "size = " + i );
    }
    
    node.add( new Integer( 5 ) );// add
    System.out.println( "size = " + node.size() );
  
System.out.println( "Elements values of my list are : " );    
 /*print*/
    for ( int i=0; i<=10; i++ ) {
     int m = ( (Integer) node.get( i ) ).intValue();
     
     System.out.println( " Element at position " +i  +" is " +m );  
     }
 

    System.out.println( "tested!" );
    }
}
