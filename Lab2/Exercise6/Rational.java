class Rational extends Number {
    private int numerator,denominator;

    Rational() {}

    Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    Rational add(Rational r2) {
        Rational result = new Rational();
        result.numerator = numerator * r2.denominator
                           + r2.numerator * denominator;
        result.denominator = denominator * r2.denominator;
        result.simplify();
        return result;
    }

    Rational subtract(Rational r2) {
        Rational result = new Rational();
        result.numerator = numerator * r2.denominator
                           - r2.numerator * denominator;
        result.denominator = denominator * r2.denominator;
        result.simplify();
        return result;
    }


    Rational multiply(Rational r2) {
        Rational result = new Rational(numerator*r2.numerator,
                                       denominator*r2.denominator);
        result.simplify();
        return result;
    }



    Rational divide(Rational r2) {
        Rational result = new Rational(numerator*r2.denominator,
                                       denominator*r2.numerator);
        result.simplify();
        return result;

    }

    private void simplify() {
        int gcd = gcd(numerator,denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    private int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }

    @Override
    public String toString() {
        if(denominator == 1) {
            return "" + numerator;
        } else {
            return numerator + "/" + denominator;
        }
    }

    @Override
    public int intValue() {
        return (int)doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 /denominator;
    }

    @Override
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override
    public long longValue() {
        return (long)doubleValue();
    }

}