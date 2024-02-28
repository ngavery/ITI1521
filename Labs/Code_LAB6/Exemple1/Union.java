public class Union{

    // Instance variables.

    private int first;
    private int second;
    private int third;

    // Constructor
    
    public Union( int first, int second, int third ) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    // An instance method that compares this object to other.
    // Always check that other is not null, i)
    // an error would occur if you tried to
    // access other.un if other was null, ii)
    // null is a valid argument, the method should
    // simply return false.

    public boolean equals( Union other ) {
        return ( ( other != null ) &&
          ( first == other.first ) &&
          ( second == other.second ) &&
          ( third == other.third ) );
    }

    // Returns a String representation of this Union.

    public String toString() {
        return first + ":" + second + ":" + third;
    }

}
