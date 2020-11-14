package acwing_p135;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*思路： 使用单调队列优化+前缀和

S[k] - S[k-j]   j 在1到m之间， 求最小的S[k-j], 则 s[k]-s[k-j]就最大。
单调队列里面存的是滑动窗口里面的最小值。
*/

public class Main {

	final static int N = 300010;

	public static void main(String[] args) throws IOException {
		int n, m;
		int[] s = new int[N];
		int[] q = new int[N];
		
		InputStream inputStream = System.in;
		//InputStream inputStream = new FileInputStream("data.txt");
		BufferedReader bf = new BufferedReader(new InputStreamReader(inputStream));
		
		String[] split = bf.readLine().split(" ");
		n = Integer.parseInt(split[0]);
		m = Integer.parseInt(split[1]);
		split = bf.readLine().split(" ");

		for (int i = 1; i <= n; i++) {
			s[i] = Integer.parseInt(split[i - 1]);
			s[i] += s[i - 1];
		}

		int res = Integer.MIN_VALUE;
		int hh = 0, tt = 0;

		for (int i = 1; i <= n; i++) {
			if (q[hh] < i - m) {
				++hh;
			}

			res = Math.max(res, s[i] - s[q[hh]]);
			while (hh <= tt && s[q[tt]] >= s[i]) {
				tt--;
			}
			q[++tt] = i;
		}
		System.out.println(res);
		bf.close();
	}
}
