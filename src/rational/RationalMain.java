package rational;

public class RationalMain {
    public static void main(String[] args) {
        Rational rational = new Rational(2, 4);
        Rational rational1 = new Rational(3, 5);
        System.out.print("add: ");
        System.out.println(rational.add(rational1));
        System.out.print("sub: ");
        System.out.println(rational.sub(rational1));
        System.out.print("mul: ");
        System.out.println(rational.mul(rational1));
        System.out.print("div: ");
        System.out.println(rational.div(rational1));
        System.out.print("as fraction: ");
        System.out.println(Rational.asFraction(rational));
        System.out.print("as fraction: ");
        System.out.println(Rational.asFraction(rational1));
        System.out.print("makhlot: ");
        System.out.println(Rational.toMakhlotString(new Rational(7, 2)));
        System.out.print("org: ");
        System.out.println(rational);
        System.out.print("org: ");
        System.out.println(rational1);
    }
}
