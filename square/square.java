import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://codeforces.com/problemset/problem/1/A
public final class square {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] values = bf.readLine().split(" ");

		long height = Long.parseLong(values[0]);
		long weight = Long.parseLong(values[1]);
		long square_side_length = Long.parseLong(values[2]);

		sb.append(necessary_stones_side(height, square_side_length) * necessary_stones_side(weight, square_side_length));

		System.out.print(sb.toString());
	}

	static long necessary_stones_side(long theatre_side_length, long stone_side_lenght){
		long necessary_stones = Math.floorDiv(theatre_side_length, stone_side_lenght);
		if (theatre_side_length % stone_side_lenght != 0){
			necessary_stones++;
		}
		return necessary_stones;
	}
}