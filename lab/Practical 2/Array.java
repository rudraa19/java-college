import java.util.Arrays;

public class Array {
    int[] data;

    Array() {
        data = new int[0];
    }

    Array(int size) {
        data = new int[size];
    }

    Array(int[] data) {
        this.data = data;
    }

    void Reverse_an_array() {
        int left = 0, right = data.length - 1;
        while (left < right) {
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;
            left++;
            right--;
        }
    }

    int Maximum_of_array() {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    double Average_of_array() {
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        return data.length > 0 ? (double) sum / data.length : 0;
    }

    void Sorting() {
        Arrays.sort(data);
    }

    void display() {
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    int search(int no) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == no) {
                return i;
            }
        }
        return -1;
    }

    int size() {
        return data.length;
    }

    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array(5);
        Array arr3 = new Array(new int[]{3, 1, 4, 1, 5, 9});

        System.out.println("Original Array:");
        arr3.display();

        System.out.println("Maximum of Array: " + arr3.Maximum_of_array());
        System.out.println("Average of Array: " + arr3.Average_of_array());

        arr3.Reverse_an_array();
        System.out.println("Reversed Array:");
        arr3.display();

        arr3.Sorting();
        System.out.println("Sorted Array:");
        arr3.display();

        System.out.println("Searching for 4 in Array: Index " + arr3.search(4));

        System.out.println("Size of Array: " + arr3.size());
    }
}
