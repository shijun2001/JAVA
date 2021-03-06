import java.io.*;

class Kadai02 {
	public static void main(String[] args) throws IOException {
		// 処理を記述;
		
		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// プログラムの意味
		System.out.println("〜〜〜俺は四則演算のプログラムだよ!〜〜〜");

		// strに文字として格納
		System.out.println("1番目の数値を入力する:");
		String str = br.readLine();		
		// num1(整数型)に変換して格納
		int num1 = Integer.parseInt(str);

		// 2つ目の値をnum2に格納
		System.out.println("2番目の数値を入力する:");
		str = br.readLine();
		int num2 = Integer.parseInt(str);

		// 演算記号をcalc(String)に格納
		System.out.println("演算の符号(加算:+、減算:-、乗算:*、割算:/、剰余算:%)を入力する:");
		str = br.readLine();		
		String calc = str;

		int rs = 0;		

		if(calc.equals("+")){ 
			// calc == '+'と同じ命令です
			rs = num1 + num2;		
		} else if (calc.equals("-")){
			rs = num1 - num2;
		} else if (calc.equals("*")){
			rs = num1 * num2;
		} else if (calc.equals("/")){
			rs = num1 / num2;
		} else if (calc.equals("%")){
			rs = num1 % num2;
		} else {
			System.out.println("該当なし");
		}

		System.out.println("演算の結果は" + rs + "です。");

	}
}