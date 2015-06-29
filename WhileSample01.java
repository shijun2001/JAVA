import java.io.*;

class WhileSample01 {
	public static void main(String[] args) throws IOException {

		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		// 数値を入力
		String str = br.readLine();
		int a = Integer.parseInt(str);

		// プリントp.50を表現;

		int i = 1;		//�@
		
		while(i <= a){	//�A
			System.out.println(i);	//�B
			i ++;			//�C
		}

		// for 文の書き方
		// for(int i = 1;i <= a;i ++)		
		//  	System.out.println(i);

	}
}