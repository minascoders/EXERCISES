import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/71/A
public class long_words {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			String input = bf.readLine();
			if(input.length() > 10){
				String format = "%s%s%s";
				sb.append(String.format(format, input.substring(0, 1), input.length() - 2,
						input.substring(input.length() - 1)));
			} else {
				sb.append(input);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
