import java.io.*;

class Template {
	public static void main(String[] args) throws IOException {
		//処理を記述;
		
		//キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		System.out.println("aから、bまでの繰り返し:");
		System.out.println("aを入力して:");			
		String str = br.readLine();
		int a = Integer.parseInt(str);
		System.out.println("bを入力して:");
		str = br.readLine();
		int b = Integer.parseInt(str);
		System.out.println("繰り返し結果:");

		/*while(a < b){
			System.out.println(a + "番目の繰り返し");
			a = a + 2;
			b = b + 1;
		}
		*/

		for(int i = a;i < b;i+=10){
			b = b + 2;
			System.out.println(i + "番目の繰り返し");
		}
	}
}