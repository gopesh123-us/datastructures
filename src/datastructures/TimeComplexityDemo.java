package datastructures;

public class TimeComplexityDemo {

	public static void main(String[] args) {
		double now = System.currentTimeMillis();
		TimeComplexityDemo tcdFirst = new TimeComplexityDemo();
		int sumOne = tcdFirst.findSum(99999);
		System.out.println(sumOne);
		System.out.println("Time taken - " + (System.currentTimeMillis() - now) + " milliseconds");

		double nowAgain = System.currentTimeMillis();
		TimeComplexityDemo tcdSecond = new TimeComplexityDemo();
		int sumTwo = tcdSecond.findSumLoop(99999);
		System.out.println(sumTwo);
		System.out.println("Time taken - " + (System.currentTimeMillis() - nowAgain) + " milliseconds");

	}

	public int findSumLoop(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int findSum(int n) {
		return n * (n + 1) / 2;
	}

}
