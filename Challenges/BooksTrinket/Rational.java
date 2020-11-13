public class Rational {
    private int numer;
    private int denom;

    public Rational(){
        this.numer = 0;
        this.denom = 1;
    }

    public Rational(int numer, int denom){
        this.numer = numer;
        this.denom = denom;
    }

    public String toString(){
        if (denom == 0){ return "error: cannot divide by 0"; }
        return numer + "/" + denom;
    }

    public void negate(){
        numer *= -1;
    }

    public double toDouble(){
        return (double) numer / (double) denom;
    }

    public void invert(){
        int temp = numer;
        // making the (+/-) sign always on the numerator
        numer = denom;

        if (temp < 0){ denom = temp *= -1; }
        denom = temp;

    }

    public int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }

    public void reduce(){
        int gcd = gcd(numer, denom);
        numer /= gcd;
        denom /= gcd;
    }

    public Rational add(Rational fraction){
        int commonDenom = fraction.denom * this.denom;
        int fracNum = this.denom * fraction.numer;
        int thisNum = fraction.denom * this.numer;

        Rational sum = new Rational(fracNum + thisNum, commonDenom);
        System.out.println(sum.toString());
        sum.reduce();

        return sum;
    }
}