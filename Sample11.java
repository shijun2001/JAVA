import java.io.*;

class Sample11 {
	public static void main(String[] args) throws IOException {
		// 処理を記述;		
		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		String str = br.readLine();
		// 数値（Int）への変換
		int num = Integer.parseInt(str);

		// ifで0または1また2の判定
		if(num == 0){
			System.out.println("入力は0です");
		} else if(num == 1){
			System.out.println("入力は1です");
		} else if(num == 2){
			System.out.println("入力は2です");	
		} else {
			System.out.println("該当なしです");
		}
	}
}