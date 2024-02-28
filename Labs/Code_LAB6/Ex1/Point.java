

class Point implements Comparable <Point> { 
  private int x, y ;
  
  Point (int x, int y){ 
    this.x = x ;
    this.y = y ;
  }

  public void display() { 
    System.out.println ( x + " " + y ) ;
  }
  
  public int compareTo (Point p) { 
    double distanceThis = Math.sqrt(x*x+y*y);
    double distanceP = Math.sqrt(p.x*p.x+p.y*p.y);

  if(distanceThis > distanceP) {
    return 1;
  }
  if(distanceThis == distanceP) {
    return 0;
  }
  else {
    return -1;
  }
  }
  }