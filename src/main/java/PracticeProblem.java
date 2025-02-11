public class PracticeProblem {

	public static void main(String args[]) {
		sum(1,2);
		difference(0, 0);
		product(0.0, 0.0);
		removeFirst(null);
		combinedLength("one", "two");
		isEven(0);
		isOdd(0);
		isPositive(0);
		isNegative(0);
	}

	public static int sum(int num, int num2) {
		return num + num2;
	}

	public static int difference(int num, int num2) {
		return num - num2;
	}

	public static double product(double fractionalNum, double fractionalNum2) {
		return fractionalNum * fractionalNum2;
	}

	public static String removeFirst(String word) {
		return word.substring(1);
	}

	public static int combinedLength(String word, String word2) {
		return word.length() + word2.length();
	}

	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

	public static boolean isOdd(int num) {
		return num % 2 != 0;
	}

	public static boolean isPositive(int num) {
		return num > 0;
	}

	public static boolean isNegative(int num) {
		return num < 0;
	}
}
