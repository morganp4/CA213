class Rational {
    private int numerator,denominator;

    Rational() {}

    Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        //simplify();
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

    public String toString() {
        if(denominator == 1) {
            return "" + numerator;
        } else {
            return numerator + "/" + denominator;
        }
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
}

class Exercise11 {
    public static void main(String[] args) {
        Rational r1 = new Rational(13,3);
        Rational r2 = new Rational(4,6);
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));

    }
}