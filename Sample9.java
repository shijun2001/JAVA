import java.io.*;

class Sample9 {
	public static void main(String[] args) throws IOException {
	
		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// プログラムの意味
		System.out.println("実数加算プログラム");

		// ２つの数値を受け取る
		System.out.print("1つ目の数値:");
		String str1 = br.readLine();

		System.out.print("2つ目の数値:");
		String str2 = br.readLine();
	
		// 実数値（double）に変換する
		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);

		// 結果出力
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); 

		// num1とnum2を加算し、sumへ格納
		double sum = num1 + num2;

		System.out.println(num1 + "と" + num2 + "の加算結果は" + sum + "です");
		



	}
}