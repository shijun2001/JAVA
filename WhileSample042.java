import java.io.*;

class WhileSample042 {
	public static void main(String[] args) throws IOException {
		// 処理を記述;
		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		// 数値を入力
		System.out.print("数値xを入力: ");
		String str = br.readLine();
		float a = Float.parseFloat(str);
		System.out.print("数値yを入力: ");
		str = br.readLine();
		float b = Float.parseFloat(str);
		System.out.print("数値xに加算する数値を入力: ");
		str = br.readLine();
		float c = Float.parseFloat(str);
		System.out.print("数値yに加算する数値を入力: ");
		str = br.readLine();
		float d = Float.parseFloat(str);


		float x = a;
		float y = b;
		int i = 0;	
		
		if(c != d){
			if(x < y){
				while(x < y){
					x += c;
					i ++;
					System.out.println("x = " + x + ", y = " + y);
					while(x > y){
						y += d;
						i ++;
						System.out.println("x = " + x + ", y = " + y);	
					}
				}
			} else if(x > y){
				while(x > y){
					y += d;
					i ++;
					System.out.println("x = " + x + ", y = " + y);
					while(x < y){
						x += c;
						i ++;
						System.out.println("x = " + x + ", y = " + y);	
					}
				}
			} else {
				System.out.println("エラーが出て来る。(c = d)の場合、答えられない!");
			}
		} else {
			System.out.println("エラーが出て来る。(c = d)の場合、答えられない!");
		}

		System.out.print("繰り返し回数が: " + i + "回です。");
	}
}