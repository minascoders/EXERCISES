import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// https://codeforces.com/problemset/problem/116/A
public final class tram {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int minimum = 0, current = 0;

		int input = Integer.parseInt(bf.readLine());
		String[] station;

		for (int index = 0; index < input - 1; index++) {
			station = bf.readLine().split(" ");
			current -= Integer.parseInt(station[0]);
			current += Integer.parseInt(station[1]);
			if (current > minimum) minimum = current;
		}

		System.out.print(minimum);
	}
}