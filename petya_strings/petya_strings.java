import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// https://codeforces.com/problemset/problem/112/A
public final class petya_strings {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int comparation = bf.readLine().compareToIgnoreCase(bf.readLine());
		if (comparation < 0) {
			System.out.println(-1);
		} else if (comparation == 0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
}