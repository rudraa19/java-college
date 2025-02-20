public class TestFinally {
  public static void main(String[] args) {
    try {
      System.out.println("inside try block");
      int data = 50/0;
      System.out.println(data);
      // cannot handle arithmetic type excepton, only handle null pointer
    } catch (NullPointerException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finally block");
    }
    System.out.println("Rest of the code");
  }
}
