import java.io.*;

class Sample13 {
	public static void main(String[] args) throws IOException {
		// 処理を記述;
		
		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		// �@　x入力
		String str = br.readLine();
		int x = Integer.parseInt(str);
		
		// �A　y入力
		str = br.readLine();
		int y = Integer.parseInt(str);

		int L,S = 0;
		
		// �B　xとy比べる
		if(x > y){			
			L = x;		// �C		
			S = y;		// �D
		} else {			
			L = y;		// �E			
			S = x;		// �F
		}

		// �G・�H
		System.out.println("大:" + L);
		System.out.println("小:" + S);
		
	}
}