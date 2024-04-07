public class Test2 {

    public static IterList complement( IterList input ) {

        IterList result;
        result = new IterList();

        Iterator i = input.iterator();
        Iterator j = result.iterator();

       // VOTRE CODE VIENT ICI
    }

    public static IterList or( IterList list1, IterList list2 ) {

        IterList result;
        result = new IterList();

        Iterator i = list1.iterator();
        Iterator j = list2.iterator();

        Iterator k = result.iterator();

        if ( ! i.hasNext() ) {
             throw new IllegalArgumentException( "list1 is empty" );
        }
        if ( ! j.hasNext() ) {
             throw new IllegalArgumentException( "list2 is empty" );
        }
        while ( i.hasNext() ) {

            // VOTRE CODE VIENT ICI
        }

        if ( j.hasNext() ) {
            throw new IllegalArgumentException( "list2 is longer than list1" );
        }
        return result;
    }

    public static void main( String[] args ) {

        IterList list1, list2;

        for ( int i=0; i<args.length; i++ ) {

            list1 = new IterList( args[i] );
            System.out.println( "> " + list1 );
            System.out.println( "< " + complement( list1 ) );
            System.out.println();

        }

        list1 = new IterList( "10001" );
        list2 = new IterList( "00011" );

        System.out.println( "list1 = " + list1 );
        System.out.println( "list2 = " + list2 );
        System.out.println( "list1 or list2 = " + or( list1, list2 ) );

      }//end of main
}//end of Test2
