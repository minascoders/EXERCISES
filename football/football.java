import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://codeforces.com/problemset/problem/96/A
public final class football {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		String[] ones = input.split("0");
		String[] ceros = input.split("1");
		String answer = "NO";
		for (String string:ones) {
			if (string.length() >= 7) {
				answer = "YES";
				break;
			}
		}
		if (answer.equals("NO")){
			for (String string:ceros) {
				if (string.length() >= 7) {
					answer = "YES";
					break;
				}
			}
		}
		System.out.print(answer);
	}
}