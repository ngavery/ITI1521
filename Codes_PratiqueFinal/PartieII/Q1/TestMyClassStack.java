public class TestMyClassStack {

    public static void main( String[] args ) {

        MyClassStack stack1;
        stack1 = new MyClassStack( );

        for ( int i=0; i<10; i++ ) {
            stack1.push( i );
        } 
        System.out.println("The size of my list is : " + stack1.count()); 
        System.out.println("And the top of my list is : " + stack1.peek()); 
             
        System.out.print( "My list is: " );
        while ( ! stack1.isEmpty() ) {
            System.out.print( stack1.pop() +" " );
        }
       
        System.out.println( );
        for ( int i=0; i<10; i++ ) {
            stack1.push(i);
        }
       
        stack1.reverse(); //reverse the order
        
             
        System.out.print( "My reversed list is: " );
        while ( ! stack1.isEmpty() ) {
            System.out.print( stack1.pop() +" " );
        }
        System.out.println( );
    }
}