import java.io.*;

class Lesson06_03 {
	public static void main(String[] args) throws IOException {
		//処理を記述;
		
		//キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		System.out.println("九九の表:");

		/*
		int i = 1;		
		while(i <= 9){
			int j = 1;
			while(j <= 9){
				System.out.print(i + "*" + j + "=" + i * j + " ");
				System.out.print("\t");
				j++;
			}
			i++;
			System.out.println("");
		}
		*/

		for(int i = 1;i <= 9;i++){
			for(int j = 1;j <= 9;j++){
				System.out.print(i + "*" + j + "=" + i * j + " ");
				System.out.print("\t");
			}
			System.out.println("");
		}
	}
}