import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// https://codeforces.com/problemset/problem/158/A
public class next_round {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] input = bf.readLine().split(" ");
		int next_round_people = Integer.parseInt(input[1]);
		List<String> scores = Arrays.asList(bf.readLine().split(" "));

		// Collections.sort(scores);

		String k_score = scores.get(next_round_people - 1);
		if (k_score.equals("0")){
			next_round_people = scores.indexOf("0");
		} else {
			next_round_people = scores.lastIndexOf(k_score) + 1;
		}
		sb.append(next_round_people);

		System.out.print(sb);
	}
}
