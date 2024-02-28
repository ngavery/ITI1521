public class Union implements Comparable {

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

    public int compareTo( Object obj ) {

        // pre-condition: (obj != null)

        Union other = (Union) obj;

        int result;

        if ( first < other.first ) {
            result = -1;
        } else if ( first > other.first ) {
            result = 1;
        } else if ( second < other.second ) {
            result = -1;
        } else if ( second > other.second ) {
            result = 1;
        } else if ( third < other.third ) {
            result = -1;
        } else if ( third > other.third ) {
            result = 1;
        } else {
            result = 0;
        }

        return result;
    }


     public boolean equals( Object obj ) {
       Union other = (Union) obj;
        return ((other != null) &&
                (first == other.first) &&
                (second == other.second) &&
                (third == other.third));
    }

    public String toString() {
        return first + ":" + second + ":" + third;
    }

}
