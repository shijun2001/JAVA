import java.io.*;

class Sample13 {
	public static void main(String[] args) throws IOException {
		// �������L�q;
		
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		// �@�@x����
		String str = br.readLine();
		int x = Integer.parseInt(str);
		
		// �A�@y����
		str = br.readLine();
		int y = Integer.parseInt(str);

		int L,S = 0;
		
		// �B�@x��y��ׂ�
		if(x > y){			
			L = x;		// �C		
			S = y;		// �D
		} else {			
			L = y;		// �E			
			S = x;		// �F
		}

		// �G�E�H
		System.out.println("��:" + L);
		System.out.println("��:" + S);
		
	}
}