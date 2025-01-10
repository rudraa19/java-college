public class MulArr{
	public static void main(String[] args) {
		int[][] myNumber = {{1, 2, 3}, {5, 6, 7}};
		for (int i = 0; i < myNumber.length; i++) {
			for (int j = 0; j < myNumber[i].length; j++) {
				System.out.print(myNumber[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
