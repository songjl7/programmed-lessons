public class RationalTester{
    public static void main(String[] args){
        Rational rational = new Rational();
        System.out.println(rational.toString());

        Rational myRational = new Rational(2, 3);
        System.out.println(myRational.toString());

        // return -2/3
        myRational.negate();
        System.out.println(myRational.toString());

        // return -0.6666666666
        System.out.println(myRational.toDouble());

        // return -3/2
        myRational.invert();
        System.out.println(myRational.toString());

        // return "cannot divide by 0"
        rational.invert();
        System.out.println(rational.toString());

        // return 3/4
        Rational unReduced = new Rational (12, 16);
        unReduced.reduce();
        System.out.println(unReduced.toString());

        // return 7/4
        Rational otherRational = new Rational(1,4);
        System.out.println(myRational.add(otherRational));
    }
}