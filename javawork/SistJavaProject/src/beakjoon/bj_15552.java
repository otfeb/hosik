package beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class bj_15552 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int i;
		String a = null;
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(i=0;i<t;i++) {
			a = br.readLine();
			st = new StringTokenizer(a);
		}
		bw.write(Integer.parseInt(a)+Integer.parseInt(a));
		
		bw.flush();
	}

}
