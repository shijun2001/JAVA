import java.io.*;

class Sample6 {
	public static void main(String[] args) throws IOException {
		//�������L�q;
		
		//�L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		String str = br.readLine();

		//���͂��ꂽ���e�����̂܂܏o�͂���
		System.out.println("���͂��ꂽ���̂́u" + str +"�v�ł�");
		
	}
}