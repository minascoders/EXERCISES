import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// https://codeforces.com/problemset/problem/282/A
public final class bit_plus_plus {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> commands = new HashMap<String, Integer>(){{
			put("X++", 1); put("++X", 1); put("X--", -1); put("--X", -1);
		}};

		int x = 0;
		int input = Integer.parseInt(bf.readLine());

		String command;

		for (int index = 0; index < input; index++) {
			command = bf.readLine();
			x += commands.get(command);
		}

		System.out.print(x);
	}
}