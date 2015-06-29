import java.io.*;

class Sample15 {
	public static void main(String[] args) throws IOException {
		//処理を記述;
		
		//キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;		

		System.out.println("０を入力する前の合計:");
		System.out.println("数値を入力して:");			
		String str = br.readLine();
		int num = Integer.parseInt(str);

		while(num != 0){
			sum = num + sum;
			str = br.readLine();
			num = Integer.parseInt(str);
		}
		
		System.out.println("今までの合計は:" + sum);
	}
}