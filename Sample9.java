import java.io.*;

class Sample9 {
	public static void main(String[] args) throws IOException {
	
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// �v���O�����̈Ӗ�
		System.out.println("�������Z�v���O����");

		// �Q�̐��l���󂯎��
		System.out.print("1�ڂ̐��l:");
		String str1 = br.readLine();

		System.out.print("2�ڂ̐��l:");
		String str2 = br.readLine();
	
		// �����l�idouble�j�ɕϊ�����
		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);

		// ���ʏo��
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); 

		// num1��num2�����Z���Asum�֊i�[
		double sum = num1 + num2;

		System.out.println(num1 + "��" + num2 + "�̉��Z���ʂ�" + sum + "�ł�");
		



	}
}