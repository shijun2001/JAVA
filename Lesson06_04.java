import java.io.*;

class Lesson06_04 {
	public static void main(String[] args) throws IOException {
		//�������L�q;
		
		//�L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		System.out.println("�݉���*:");

		String str = br.readLine();
		int m = Integer.parseInt(str);
		/*str = br.readLine();
		int n = Integer.parseInt(str);*/

		for(int i = 0;i < m;i++){
			for(int j = 0;j <= i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}

		for(int k = m - 1;k >= 1;k--){
			for(int l=0;l < k;l++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}