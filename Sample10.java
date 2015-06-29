import java.io.*;

class Sample10_2 {
	public static void main(String[] args) throws IOException {
		// 処理を記述;		
		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		String str = br.readLine();
		// 数値（Int）への変換
		int num = Integer.parseInt(str);

		/* ifで偶数・奇数の判定
		*		（ヒント 割り算の余り・・・）
		*　剰余算の記号は「%」
		*/
		if(num == 0){
			// 「0」の場合
			System.out.println("無理だよ～、" + num + "は非法数値だよ。");
		} else if( (num % 2) == 0){
			// 「偶数です」と出力する
			System.out.println("脳残さん～、" + num + "は偶数だよ。");
		} else {
			// 「奇数です」と出力する
			System.out.println("キミが阿呆じゃない・・・、" + num + "は奇数だよ。");
		}
	}
}