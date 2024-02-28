class Test {
    public static void main( String[] args ) {

        Union u1, u2 ;
        u1 = new Union ( 1 , 1 , 1 ) ;
        u2 = new Union ( 2 , 2 , 2 ) ;

       
        if ( u1.compareTo( u2 ) < 0 ) {
            System.out.println( "test 1: ok" );
        } else {
            System.out.println( "test 1 : failed" );
        }

         u1 = new Union ( 1 , 1 , 1 ) ;
         u2 = new Union ( 2 , 2 , 1 ) ;

        if ( u1.compareTo( u2 ) <= 0 ) {
            System.out.println( "test 2: ok" );
        } else {
            System.out.println( "test 2: failed" );
        }

        u1 = new Union( 1, 1, 2 );
        u2 = new Union( 2, 2, 1 );

        if ( u1.compareTo( u2 ) < 0 ) {
            System.out.println( "test 3: ok" );
        } else {
            System.out.println( "test 3: failed" );
        }

        u1 = new Union( 1, 1, 1 );
        u2 = new Union( 2, 1, 2 );

        if ( u1.compareTo( u2 ) < 0 ) {
            System.out.println( "test 4: ok" );
        } else {
            System.out.println( "test 4: failed" );
        }

        u1 = new Union( 1, 1, 1 );
        u2 = new Union( 2, 1, 1 );

        if ( u1.compareTo( u2 ) < 0 ) {
            System.out.println( "test 5: ok" );
        } else {
            System.out.println( "test 5: failed" );
        }

        u1 = new Union( 1, 1, 2 );
        u2 = new Union( 2, 1, 1 );

        if ( u1.compareTo( u2 ) < 0 ) {
            System.out.println( "test 06: ok" );
        } else {
            System.out.println( "test 06: failed" );
        }

        u1 = new Union( 1, 2, 1 );
        u2 = new Union( 2, 1, 2 );

        if ( u1.compareTo( u2 ) < 0 ) {
            System.out.println( "test 7: ok" );
        } else {
            System.out.println( "test 7: failed" );
        }

        u1 = new Union( 1, 2, 1 );
        u2 = new Union( 2, 1, 1 );

        if ( u1.compareTo( u2 ) < 0 ) {
            System.out.println( "test 8: ok" );
        } else {
            System.out.println( "test 8: failed" );
        }

        u1 = new Union( 1, 2, 2 );
        u2 = new Union( 2, 1, 1 );

        if ( u1.compareTo( u2 ) < 0 ) {
            System.out.println( "test 9: ok" );
        } else {
            System.out.println( "test 09: failed" );
        }

        u1 = new Union( 1, 1, 1 );
        u2 = new Union( 1, 2, 2 );

        if ( u1.compareTo( u2 ) < 0 ) {
            System.out.println( "test 10: ok" );
        } else {
            System.out.println( "test 10: failed" );
        }

        u1 = new Union( 1, 1, 1 );
        u2 = new Union( 1, 2, 1 );

        if ( u1.compareTo( u2 ) < 0 ) {
            System.out.println( "test 11: ok" );
        } else {
            System.out.println( "test 11: failed" );
        }

        u1 = new Union( 1, 1, 2 );
        u2 = new Union( 1, 2, 1 );

        if ( u1.compareTo( u2 ) < 0 ) {
            System.out.println( "test 12: ok" );
        } else {
            System.out.println( "test 12: failed" );
        }

        u1 = new Union( 1, 1, 1 );
        u2 = new Union( 1, 1, 2 );

        if ( u1.compareTo( u2 ) < 0 ) {
            System.out.println( "test 13: ok" );
        } else {
            System.out.println( "test 13: failed" );
        }

        u1 = new Union( 1, 1, 1 );
        u2 = new Union( 1, 1, 1 );

        if ( u1.compareTo( u2 ) == 0 ) {
            System.out.println( "test 14: ok" );
        } else {
            System.out.println( "test 14: failed" );
        }

        u1 = new Union( 1, 1, 2 );
        u2 = new Union( 1, 1, 1 );

        if ( u1.compareTo( u2 ) > 0 ) {
            System.out.println( "test 15: ok" );
        } else {
            System.out.println( "test 15: failed" );
        }

        u1 = new Union( 1, 2, 1 );
        u2 = new Union( 1, 1, 2 );

        if ( u1.compareTo( u2 ) > 0 ) {
            System.out.println( "test 16: ok" );
        } else {
            System.out.println( "test 16: failed" );
        }

        u1 = new Union( 1, 2, 1 );
        u2 = new Union( 1, 1, 1 );

        if ( u1.compareTo( u2 ) > 0 ) {
            System.out.println( "test 17: ok" );
        } else {
            System.out.println( "test 17: failed" );
        }

        u1 = new Union( 1, 2, 2 );
        u2 = new Union( 1, 1, 1 );

        if ( u1.compareTo( u2 ) > 0 ) {
            System.out.println( "test 18: ok" );
        } else {
            System.out.println( "test 18: failed" );
        }

        u1 = new Union( 2, 1, 1 );
        u2 = new Union( 1, 2, 2 );

        if ( u1.compareTo( u2 ) > 0 ) {
            System.out.println( "test 19: ok" );
        } else {
            System.out.println( "test 19: failed" );
        }

        u1 = new Union( 2, 1, 1 );
        u2 = new Union( 1, 2, 1 );

        if ( u1.compareTo( u2 ) > 0 ) {
            System.out.println( "test 20: ok" );
        } else {
            System.out.println( "test 20: failed" );
        }

        u1 = new Union( 2, 1, 2 );
        u2 = new Union( 1, 2, 1 );

        if ( u1.compareTo( u2 ) > 0 ) {
            System.out.println( "test 21: ok" );
        } else {
            System.out.println( "test 21: failed" );
        }

        u1 = new Union( 2, 1, 1 );
        u2 = new Union( 1, 1, 2 );

        if ( u1.compareTo( u2 ) > 0 ) {
            System.out.println( "test 22: ok" );
        } else {
            System.out.println( "test 22: failed" );
        }

        u1 = new Union( 2, 1, 1 );
        u2 = new Union( 1, 1, 1 );

        if ( u1.compareTo( u2 ) > 0 ) {
            System.out.println( "test 23: ok" );
        } else {
            System.out.println( "test 23: failed" );
        }

        u1 = new Union( 2, 1, 2 );
        u2 = new Union( 1, 1, 1 );

        if ( u1.compareTo( u2 ) > 0 ) {
            System.out.println( "test 24: ok" );
        } else {
            System.out.println( "test 24: failed" );
        }

        u1 = new Union( 2, 2, 1 );
        u2 = new Union( 1, 1, 2 );

        if ( u1.compareTo( u2 ) > 0 ) {
            System.out.println( "test 25: ok" );
        } else {
            System.out.println( "test 25: failed" );
        }

        u1 = new Union( 2, 2, 1 );
        u2 = new Union( 1, 1, 1 );

        if ( u1.compareTo( u2 ) > 0 ) {
            System.out.println( "test 26: ok" );
        } else {
            System.out.println( "test 26: failed" );
        }

        u1 = new Union( 2, 2, 2 );
        u2 = new Union( 1, 1, 1 );

        if ( u1.compareTo( u2 ) > 0 ) {
            System.out.println( "test 27: ok" );
        } else {
            System.out.println( "test 27: failed" );
        }

      }

}
