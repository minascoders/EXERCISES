import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://codeforces.com/problemset/problem/50/A
public final class domino_piling {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int dominoes;
		String[] input = bf.readLine().split(" ");
		int width = Integer.parseInt(input[0]);
		int height = Integer.parseInt(input[1]);

		dominoes = (width / 2) * height;
		if (width % 2 != 0) {
			dominoes += height / 2;
		}

		System.out.print(dominoes);
	}
}