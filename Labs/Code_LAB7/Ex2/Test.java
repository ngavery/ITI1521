public class Test {

       public static boolean algorithm2( String str ) {

        Stack<Character> myStack;
        myStack = new ArrayStack<Character>( 100 );

        for ( int i=0; i<str.length(); i++ ) {

            char current = str.charAt( i );

            if (current == '(' || current == '[' || current == '{') {
                myStack.push(current);
            } 
            else if (current == ')' || current == ']' || current == '}') {

                if (!myStack.isEmpty()) {
                    char opening = myStack.pop();
            
                    if ((current == ')' && opening != '(') ||
                        (current == ']' && opening != '[') ||
                        (current == '}' && opening != '{')) {
                        return false; 
                    }
                } 
                else {
                    return false;
                }
            }
        }

        return myStack.isEmpty();
    }

    public static void main( String[] args ) {
     
       System.out.println( "algorithm2( \"" + "()[]() " + "\" ) returns " + algorithm2( "()[]()" ) );      
       System.out.println( "algorithm2( \"" + "(14 * (47 - 2))) " + "\" ) returns " + algorithm2( "(14 * (47 - 2)) )" ) );
       System.out.println( "algorithm2( \"" + "((())" + "\" ) returns " + algorithm2( "((())" ) );
    
    }
}
