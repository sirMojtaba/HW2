package rational;

public class Rational {
    double numerator;
    double denominator;

    public Rational(double numerator, double denominator) {
        this.numerator = numerator / gcd(numerator, denominator);
        this.denominator = denominator / gcd(numerator, denominator);
    }

    public double getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public static double gcd(double a, double b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public void simplify(double a, double b) {
        a = a / gcd(a, b);
        b = b / gcd(a, b);
    }

    public Rational add(Rational num) {
        double resultNumerator = (numerator * num.denominator) + (num.numerator * denominator);
        double resultDenominator = (denominator * num.denominator);
        Rational result = new Rational(resultNumerator, resultDenominator);
        return result;
    }

    public Rational sub(Rational num) {
        double resultNumerator = (numerator * num.denominator) - (num.numerator * denominator);
        double resultDenominator = (denominator * num.denominator);
        Rational result = new Rational(resultNumerator, resultDenominator);
        return result;
    }

    public Rational mul(Rational num) {
        double resultNumerator = numerator * num.numerator;
        double resultDenominator = denominator * num.denominator;
        Rational result = new Rational(resultNumerator, resultDenominator);
        return result;
    }

    public Rational div(Rational num) {
        double resultNumerator = numerator * num.denominator;
        double resultDenominator = denominator * num.numerator;
        Rational result = new Rational(resultNumerator, resultDenominator);
        return result;
    }

    public float toFloatingPoint(Rational num) {
        float ans = (float) (num.numerator / num.denominator);
        return ans;
    }

    public static String asFraction(Rational num) {
        double gcd = gcd(num.numerator, num.denominator);
        return (num.numerator / gcd) + "/" + (num.denominator / gcd);
    }

    public static String toMakhlotString(Rational num) {
        String mixedNum;
        long wholeNum;
        wholeNum = (long) Math.floor(num.numerator / num.denominator);
        mixedNum = wholeNum + " + " + (num.numerator - wholeNum * num.denominator) + "/" + num.denominator;
        return mixedNum;
    }

    @Override
    public String toString() {
        return "Rational{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
