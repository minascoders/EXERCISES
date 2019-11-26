import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

// https://codeforces.com/problemset/problem/339/A
public final class helpful_maths {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] input = bf.readLine().split("\\+");
		Arrays.sort(input);
		System.out.print(String.join("+", input));
	}
}