
class Test5 {

    public static void main( String[] args ) {

    ListNode node = new ListNode();
    if ( node.size() != 0 )
     System.out.println( "List not empty " );
    
    // add 
     node.add( new String( "C") );
     node.add( new String( "E") );
     node.add( new String( "H") );
    
       System.out.println("size is " + node.size() );
 

 /*print*/
 System.out.println( " elements of my first list are : " );
 for ( int i=0; i<3; i++ ) {
     String str = (String) node.get( i ) ;        
     System.out.println( str );  
     }
     System.out.println( "add tested " );

 
 
 /**merge**/
 ListNode node2 = new ListNode();

        // add 
    node2.add( new String( "A") );
    node2.add( new String( "B") );
    node2.add( new String( "C") );
    node2.add( new String( "F") );
   
    
        node.merge( node2 );
     
        System.out.println("===========================================");
        System.out.println("after merging, elements are : ");
        for ( int i=0; i<node.size(); i++ ) {
              String str = (String) node.get( i ) ;     
                System.out.println(str);
       }
 System.out.println( "merge tested!" );
    }
}
