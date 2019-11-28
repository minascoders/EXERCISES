import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://codeforces.com/problemset/problem/236/A
public final class boy_or_girl {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] characters = bf.readLine().split("");
		// Parse an array to a list and parse a list to a set
		Set<String> charactersSet = new HashSet<String>(Arrays.asList(characters));
		System.out.print(charactersSet.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
	}
}