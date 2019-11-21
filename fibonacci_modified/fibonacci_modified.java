import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// https://www.hackerrank.com/challenges/fibonacci-modified/problem?isFullScreen=true
public class fibonacci_modified {

	// Complete the fibonacciModified function below.
	static BigDecimal fibonacciModified2(int t1, int t2, int n) {
		BigDecimal tminus2 = new BigDecimal(t1);
		BigDecimal tminus1 = new BigDecimal(t2);
		BigDecimal t = new BigDecimal(0);
		for (int index = 0; index < n - 2; index++){
			t = tminus2.add(tminus1.pow(2));
			tminus2 = tminus1;
			tminus1 = t;
		}
		return tminus1;

	}

	static int t1;
	static int t2;

	// Complete the fibonacciModified function below.
	static BigDecimal fibonacciModified(int n) {
		// System.out.println(n);
		if (n == 2) {
			BigDecimal tminus2 = new BigDecimal(t1);
			BigDecimal tminus1 = new BigDecimal(t2);
			return tminus1.add(tminus2.pow(2));
		}
		if (n == 1) {
			return new BigDecimal(0);
		}
		return fibonacciModified(n-2).add(fibonacciModified(n-1).pow(2));
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String[] t1T2n = scanner.nextLine().split(" ");

		t1 = Integer.parseInt(t1T2n[0]);

		t2 = Integer.parseInt(t1T2n[1]);

		int n = Integer.parseInt(t1T2n[2]);

		BigDecimal result = fibonacciModified(n);

		System.out.println(result);
		scanner.close();
	}
}
