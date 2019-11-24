import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://codeforces.com/problemset/problem/118/A
public final class string_task {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine().toLowerCase();

		String [] vowels = {"a", "e", "i", "o", "u", "y"};
		for (String vowel:vowels) {
			input = input.replaceAll(vowel, "");
		}
		input = String.join(".", input.split(""));

		System.out.print("." + input);
	}
}