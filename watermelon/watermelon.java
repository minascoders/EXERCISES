import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://codeforces.com/problemset/problem/4/A#
public final class watermelon {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input;
		StringBuilder sb = new StringBuilder();
		input = bf.readLine();
		byte weight = Byte.parseByte(input);

		sb.append(isEvenable(weight) ? "YES" : "NO");

		System.out.print(sb.toString());
	}

	static boolean isEvenable(byte weight){
		return weight > 2 && weight % 2 == 0;
	}
}