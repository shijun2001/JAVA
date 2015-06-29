import java.io.*;

class Lesson06_06 {
	public static void main(String[] args) throws IOException {
		//処理を記述;
		
		//キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		System.out.println("累加の*:");

		String str = br.readLine();
		int num = Integer.parseInt(str);
		/*str = br.readLine();
		int m = Integer.parseInt(str);*/

		for(int i = 0;i <= num;i++){
			for(int j = 1; j <= num - i;j++){
				System.out.print(" ");
			}
			for(int k = 1;k <= i * 2 - 1;k++){
				if(k == 1){
					System.out.print("*");
				}else{
					if(k == 1 || k == i * 2-1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}

		for(int l = num - 1;l >= 0;l--){
			for(int m = 1;m <= num - l;m++){
				System.out.print(" ");
			}
			for(int n = 1;n <= l * 2 - 1;n++){
				if(n == 1 || n == l * 2-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}