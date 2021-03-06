import java.io.*;

class Kadai02_PW11A_03 {
	public static void main(String[] args) throws IOException {
		// 処理を記述;
		
		// キーボード入力の受け付け
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		// プログラムの意味
		System.out.println("〜〜〜俺は四則演算のプログラムだよ!〜〜〜");

		// strに文字として格納
		System.out.print("1番目の数値を入力:");
		String str = br.readLine();
		// num1(整数型)に変換して格納
		double num1 = Double.parseDouble(str);

		// 2つ目の値をnum2に格納
		System.out.print("2番目の数値を入力:");
		str = br.readLine();
		double num2 = Double.parseDouble(str);

		// 演算記号をcalc(String)に格納
		System.out.print("演算の符号(加算:+、減算:-、乗算:*、割算:/、剰余算:%)を入力:");
		str = br.readLine();
		String calc = str;

		double rs = 0;

		if(calc.equals("+")){ 
			// calc == '+'と同じ命令です
			rs = num1 + num2;
		} else if (calc.equals("-")){
			// calc == '-'と同じ命令です
			rs = num1 - num2;
		} else if (calc.equals("*")){
			// calc == '*'と同じ命令です
			rs = num1 * num2;
		} else if (calc.equals("/")){
			// calc == '/'と同じ命令です
			rs = num1 / num2;
		} else if (calc.equals("%")){
			// calc == '%'と同じ命令です
			rs = num1 % num2;
		} else {
			System.out.println("演算の符号が違うよ！");
			System.exit(0);
		}
		
		System.out.println(num1 + calc + num2 + "の結果は" + rs + "です。");
		
	}
}