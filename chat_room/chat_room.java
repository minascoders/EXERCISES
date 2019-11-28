import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// https://codeforces.com/problemset/problem/58/A
public final class chat_room {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		System.out.println(isHello(input));

	}

	static String isHello(String input){
		if (input.length() < 5) {
			return "NO";
		} else {
			List<Character> hello = new LinkedList<Character>(Arrays.asList('h', 'e', 'l', 'l', 'o'));
			for (char character:input.toCharArray()) {
				if (character == hello.get(0)){
					hello.remove(0);
					if (hello.size() == 0) return "YES";
				}
			}
			return "NO";
		}
	}

}