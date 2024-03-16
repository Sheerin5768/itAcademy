package methods;

public class AreaOfARectangular {
    public static void main (String[] args) {
        Rectangular rectOne = new Rectangular() ;
        rectOne.width = 3;
        rectOne.length = 6;
        System.out.println ("6 * 3 = " + rectOne.calculateSquare());
        Rectangular rectTwo = new Rectangular();
        rectTwo.setWidth( 4 );
        rectTwo.setLength( 6 );
        System.out.println ( "4 * 6 = " + rectTwo.calculateSquare());
    }


}


