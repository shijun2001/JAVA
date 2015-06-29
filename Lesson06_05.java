import java.io.*;

class Lesson06_05 {
	public static void main(String[] args) throws IOException {
		//処理を記述;
		
		//キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		System.out.println("2以上の整数を入力して下さい:");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		int i;		

		for(i = 2;i < num && (num % i != 0);i++);

		if(i == num){
			str =  "は素数です。";
		}else{
			str =  "は素数ではありません。";
		}
		
		System.out.println(num + str);
	}
}