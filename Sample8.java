import java.io.*;

class Sample8 {
	public static void main(String[] args) throws IOException {
	
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// �v���O�����̈Ӗ�
		System.out.println("���Z�v���O����");

		// �Q�̐��l���󂯎��
		System.out.print("1�ڂ̐��l:");
		String str1 = br.readLine();

		System.out.print("2�ڂ̐��l:");
		String str2 = br.readLine();
	
		// str1,str2 �𐔒l�ɕϊ�����
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

		// num1��num2�����Z���Asum�֊i�[
		int sum = num1 + num2;

		System.out.println(num1 + "��" + num2 + "�̉��Z���ʂ�" + sum + "�ł�");

	}
}