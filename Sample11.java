import java.io.*;

class Sample11 {
	public static void main(String[] args) throws IOException {
		// �������L�q;		
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		String str = br.readLine();
		// ���l�iInt�j�ւ̕ϊ�
		int num = Integer.parseInt(str);

		// if��0�܂���1�܂�2�̔���
		if(num == 0){
			System.out.println("���͂�0�ł�");
		} else if(num == 1){
			System.out.println("���͂�1�ł�");
		} else if(num == 2){
			System.out.println("���͂�2�ł�");	
		} else {
			System.out.println("�Y���Ȃ��ł�");
		}
	}
}