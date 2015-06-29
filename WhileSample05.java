import java.io.*;

class WhileSample05 {
	public static void main(String[] args) throws IOException {
		// 処理を記述;
		int cpu = (int)(Math.random()*100)+1;

		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		// 数値を入力
		System.out.print("数値aを入力: ");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		int i = 0;	
		
		while(cpu != num) {
			if(cpu > num) {
				i ++;
				System.out.println("もっと大きい！");
			} else {
				i ++;
				System.out.println("もっと小さい！");
			}
			
			// 再度num入力
			str = br.readLine();
			num = Integer.parseInt(str);
		}

		System.out.println(i + "回やった、あたり！");				
					
	}
}