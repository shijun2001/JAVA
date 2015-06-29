import java.io.*;

class WhileSample041 {
	public static void main(String[] args) throws IOException {
		// 処理を記述;
		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		// 数値を入力
		System.out.print("数値xを入力: ");
		String str = br.readLine();
		int a = Integer.parseInt(str);
		System.out.print("数値yを入力: ");
		str = br.readLine();
		int b = Integer.parseInt(str);
		System.out.print("数値xに加算する数値aを入力: ");
		str = br.readLine();
		int c = Integer.parseInt(str);
		System.out.print("数値yに加算する数値bを入力: ");
		str = br.readLine();
		int d = Integer.parseInt(str);


		int x = a;
		int y = b;
		int i = 0;	
		

		if(c != d && c > 0 && d > 0){
			while(x != y){
				if(x > y){
					y += d;
					i ++;
				} else {
					x += c;
					i ++;
				}
				System.out.println("x = " + x + ", y = " + y);	
			}
		} else {
			System.out.println("エラーが出て来る。(c = d)また(c & d <= 0)の場合、答えられない!");
		}

		System.out.println("繰り返し回数が: " + i + "回です。");
	}
}