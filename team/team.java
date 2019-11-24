import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://codeforces.com/problemset/problem/231/A
public final class team {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int exercises = Integer.parseInt(bf.readLine());
		int numberOfExercises = 0;

		for (int index = 0; index < exercises; index++) {
			String [] members = bf.readLine().split(" ");
			int clearMembers = 0;
			for (String member:members) {
				if (member.equals("1")) {
					clearMembers++;
				}
				if (clearMembers == 2) {
					numberOfExercises++;
					break;
				}
			}
		}

		System.out.print(numberOfExercises);
	}
}