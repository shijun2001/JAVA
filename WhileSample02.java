import java.io.*;

class WhileSample02 {
	public static void main(String[] args) throws IOException {
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		// ���l�����
		String str = br.readLine();
		int a = Integer.parseInt(str);
		
		int i = 1;
		int S = 0;
		
		//for(int i = 1;i < 5;i ++){			
		//	S += i;
		//}

		while(i <= a){
			S += i;
			i ++;
		}

		System.out.println(S);

	}
}