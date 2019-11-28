import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://codeforces.com/problemset/problem/281/A
public final class capitalize {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(capitalize(bf.readLine()));
	}

	static String capitalize(String word){
		return word.substring(0, 1).toUpperCase() + word.substring(1);
	}

}