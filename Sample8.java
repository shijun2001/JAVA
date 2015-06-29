import java.io.*;

class Sample8 {
	public static void main(String[] args) throws IOException {
	
		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// プログラムの意味
		System.out.println("加算プログラム");

		// ２つの数値を受け取る
		System.out.print("1つ目の数値:");
		String str1 = br.readLine();

		System.out.print("2つ目の数値:");
		String str2 = br.readLine();
	
		// str1,str2 を数値に変換する
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

		// num1とnum2を加算し、sumへ格納
		int sum = num1 + num2;

		System.out.println(num1 + "と" + num2 + "の加算結果は" + sum + "です");

	}
}