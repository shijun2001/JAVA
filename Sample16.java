import java.io.*;

class Sample16 {
	public static void main(String[] args) throws IOException {
		//処理を記述;
		
		//キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		System.out.println("累加の*:");

		for(int i = 1;i <= 5;i++){
			for(int j = 1;j <= i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}

		for(int k = 5-1;k >= 1;k--){
			for(int l=1;l<=k;l++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}