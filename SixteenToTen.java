import java.io.*;

class SixteenToTen {
	public static void main(String[] args) throws IOException {
		// 処理を記述;
		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// ジャンケンプログラム
		System.out.println("16進数→10進数に変換するプログラム"); 
		System.out.print("16進数を入力して:"); 

		String str = br.readLine();
		int num = Integer.parseInt(str,16);


		System.out.println(num);	
	}
}