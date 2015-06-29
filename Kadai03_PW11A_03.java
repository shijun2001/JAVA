import java.io.*;

class Kadai03_PW11A_03 {
	public static void main(String[] args) throws IOException {
		// 処理を記述;		
		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		System.out.print("降水確率を入力して下さい(0～100):");
			
		String str = br.readLine();
		// 数値（Int）への変換
		double num = Double.parseDouble(str);

		// ifで0または1また2の判定
		if(num >= 80 && num <= 100){
			System.out.println("降水確率は" + num + "%です。" + "傘を持参して下さい。");
		} else if(num >= 40){
			System.out.println("降水確率は" + num + "%です。" + "折りたたみ傘を持参して下さい。");
		} else if(num >= 0){
			System.out.println("降水確率は" + num + "%です。" + "傘は不要です。");	
		} else {
			System.out.println("該当なしです。");
		}
	}
}