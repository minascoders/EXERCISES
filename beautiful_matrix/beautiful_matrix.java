import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://codeforces.com/problemset/problem/263/A
public final class beautiful_matrix {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int index;
		int oneIndex = -1;
		for (index = 1; index < 6; index++) {
			String input = bf.readLine();
			oneIndex = input.indexOf("1");
			if (oneIndex != -1){
				oneIndex /= 2;
				oneIndex++;
				break;
			}
		}
		int steps = Math.abs(3 - index);
		steps += Math.abs(3 - oneIndex);
		System.out.print(steps);
	}
}