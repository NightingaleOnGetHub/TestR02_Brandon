public class Test {
  public static void main(String[] args) {
    int a = 4;
    int b = 71;
    System.out.pringln("a = " + a);
    System.out.println("b = " + b);

    b = a;
    a = b;

    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}
