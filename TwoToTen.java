import java.io.*;

class TwoToTen {
	public static void main(String[] args) throws IOException {
		// 処理を記述;
		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// ジャンケンプログラム
		System.out.println("2進数→10進数に変換するプログラム"); 
		System.out.print("2進数を入力して:"); 

		String str = br.readLine();
		int num = Integer.parseInt(str);
		int sum = 0;
		int i = 0;

		while(num != 0){
			sum = (int)(sum + num % 10 * (Math.pow(2,i)));
			num	= num / 10;
			i++;
		}
		System.out.println(sum);	
	}
}