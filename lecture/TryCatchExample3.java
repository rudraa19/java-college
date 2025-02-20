public class TryCatchExample3 {
  public static void main(String[] args) {
    int i = 50;
    int j = 0;
    int data;
    try {
     data = i/j;  // will throw exception 
    } catch (Exception e) {
      System.out.println(i/(j+1));  // resolving exception
    }
  }
}
