import java.io.*;

class WhileSample01 {
	public static void main(String[] args) throws IOException {

		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		// ���l�����
		String str = br.readLine();
		int a = Integer.parseInt(str);

		// �v�����gp.50��\��;

		int i = 1;		//�@
		
		while(i <= a){	//�A
			System.out.println(i);	//�B
			i ++;			//�C
		}

		// for ���̏�����
		// for(int i = 1;i <= a;i ++)		
		//  	System.out.println(i);

	}
}