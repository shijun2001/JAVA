import java.io.*;

class Sample6 {
	public static void main(String[] args) throws IOException {
		//処理を記述;
		
		//キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		String str = br.readLine();

		//入力された内容をそのまま出力する
		System.out.println("入力されたものは「" + str +"」です");
		
	}
}