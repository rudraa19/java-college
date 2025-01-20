import java.util.Arrays;

public class ArrayClone {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4, 5};
    int[] array2 = array1.clone();

    System.out.println("Array1: " + Arrays.toString(array1));
    System.out.println("Array2: " + Arrays.toString(array2));

  }
} 
