import java.io.*;

class ArraySample01 {
	public static void main(String[] args) throws IOException {
		// �������L�q;
		
		// �z��̌^����єz�񖼂̌���(�錾)
		int[] test;
		// �v�f���̌���
		test = new int[5];
		// �l�̑��
		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 75;

		// SUM�ɍ��v�����߂�
		int sum = test[0] + test[1] + test[2] + test[3] + test[4];

		// for�����g����SUM2�ɍ��v�����߂�
		int sum2 = 0;
		for(int i = 0;i < 5;i++){
			sum2 = sum2 + test[i];
		}
		
		System.out.println("���v��" + sum + "�ł�");
		System.out.println("���v��" + sum2 + "�ł�");
	}
}