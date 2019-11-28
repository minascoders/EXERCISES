import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// https://codeforces.com/problemset/problem/69/A
public final class young_physicist {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int input = Integer.parseInt(bf.readLine());
		String[] vector;

		int x = 0;
		int y = 0;
		int z = 0;

		for (int index = 0; index < input; index++) {
			vector = bf.readLine().split(" ");
			x += Integer.parseInt(vector[0]);
			y += Integer.parseInt(vector[1]);
			z += Integer.parseInt(vector[2]);
		}

		System.out.print(x != 0 || y != 0 || z != 0 ? "NO" : "YES");

	}
}