import java.io.*;

class ArraySample02 {
	public static void main(String[] args) throws IOException {
		// �������L�q;
		
		// �z��̌^����єz�񖼂̌���(�錾)
		String[] fortune;
		// �v�f���̌���
		fortune = new String[5];
		// �l�̑��
		fortune[0] = "��g";
		fortune[1] = "�g";
		fortune[2] = "���g";
		fortune[3] = "���g";
		fortune[4] = "��";

		
		// �����̎�蓾��(0�`4)
		int hit = (int)(Math.random() * 5);

		System.out.print("�����̂��Ȃ��̉^���́u" + fortune[hit] + "�v�ł��B");
		
	}
}