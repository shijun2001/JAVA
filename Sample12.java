import java.io.*;

class Sample12 {
	public static void main(String[] args) throws IOException {
		// 処理を記述;
		
		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			

		// �@
		String str = br.readLine();
		int a = Integer.parseInt(str);
		int b = 0;

		// �A
		if(a < 5){	
			// �B
			b = a * 3;
		} else {
			// �C
			b = a * 2;
		}
		// �D
		System.out.println(b);
		
	}
}