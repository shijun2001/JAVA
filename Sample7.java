import java.io.*;

class Sample7 {
	public static void main(String[] args) throws IOException {
	
		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		String str = br.readLine();
		// 整数値（Int）への変換
		int num = Integer.parseInt(str);
		
		//num = num * 3;
		// 3倍した値を出力
		//System.out.println(num);

		// 「〇〇を3倍したら△△です」と出力
		//System.out.println(num + "を3倍したら" + (num * 3) + "です");

		// num2 ←　num　コピー
		int num2 = num;

		// num2を3倍する
		num2 = num * 3;

		System.out.println(num + "を3倍すると" + num2 + "です");
		
	}
}