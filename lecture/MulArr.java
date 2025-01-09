public class MulArr{
	public static void main(String[] args) {
		int[][] myNumber = {{1, 2, 3}, {5, 6, 7}};
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(myNumber[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
