import java.io.*;

class Sample10_2 {
	public static void main(String[] args) throws IOException {
		// �������L�q;		
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		String str = br.readLine();
		// ���l�iInt�j�ւ̕ϊ�
		int num = Integer.parseInt(str);

		/* if�ŋ����E��̔���
		*		�i�q���g ����Z�̗]��E�E�E�j
		*�@��]�Z�̋L���́u%�v
		*/
		if(num == 0){
			// �u0�v�̏ꍇ
			System.out.println("��������`�A" + num + "�͔�@���l����B");
		} else if( (num % 2) == 0){
			// �u�����ł��v�Əo�͂���
			System.out.println("�]�c����`�A" + num + "�͋�������B");
		} else {
			// �u��ł��v�Əo�͂���
			System.out.println("�L�~����������Ȃ��E�E�E�A" + num + "�͊����B");
		}
	}
}