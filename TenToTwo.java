import java.io.*;

class TenToTwo {
	public static void main(String[] args) throws IOException {
		// 処理を記述;
		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// ジャンケンプログラム
		System.out.println("10進数→2進数に変換するプログラム"); 
		System.out.print("10進数を入力して:"); 

		String str = br.readLine();
		int num = Integer.parseInt(str);

		int i,j = 0;
		String k = "";
		String l = "";

		while(num >= 1){
			if(num % 2 == 0){
				j = 0;
				k = String.valueOf(j);
				l = k + l;
			} else {
				j = 1;
				k = String.valueOf(j);
				l = k + l;
			}
			num = num / 2;		
		}
		System.out.println(l);	
	}
}