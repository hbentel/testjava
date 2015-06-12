package hello;

public class HelloWorld {
  public static void main(String [] args) {
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());

    Integer a = Integer.valueOf(args[0]);
    Integer b = Integer.valueOf(args[1]);
    System.out.println("Euclid's answer to GCD: " + Math.abs(gcd(a, b)));
  }

  private static Integer gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    int remainder = a % b;
    return gcd(b, remainder);
  }
}
