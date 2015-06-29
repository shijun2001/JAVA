import java.io.*;

class Sample {
	public static void main(String[] args) throws IOException {
	
		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();

		// 整数値（Int）への変換
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		char ch = String(str3);
		
		//num = num * 3;
		// 3倍した値を出力
		//System.out.println(num);

		// 「〇〇を3倍したら△△です」と出力
		System.out.println(num1 + ch + num2);
		
	}
}