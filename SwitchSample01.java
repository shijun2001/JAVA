import java.io.*;

class SwitchSample01 {
	public static void main(String[] args) throws IOException {
		// 処理を記述;
		
		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		// num1入力(文字列から変換)
		String str = br.readLine();
		double num1 = Double.parseDouble(str);

		// calc入力(文字のまま)
		String calc = br.readLine();		
		
		// num2入力(文字列から変換)
		str = br.readLine();
		double num2 = Double.parseDouble(str);

		double rs = 0;

		switch(calc){
			case "+":
				rs = num1 + num2;
				break;
			case "-":
				rs = num1 - num2;
				break;
			case "*":
				rs = num1 * num2;
				break;
			case "/":
				rs = num1 / num2;
				break;
			case "%":
				rs = num1 % num2;
				break;
			default:	// 該当なしのとき
				System.out.println("エラー");
				break;
		}

		System.out.println("結果は" + rs + "です。");

	}
}