import java.io.*;

class Kadai02_PW11A_03 {
	public static void main(String[] args) throws IOException {
		// �������L�q;
		
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		// �v���O�����̈Ӗ�
		System.out.println("�`�`�`���͎l�����Z�̃v���O��������!�`�`�`");

		// str�ɕ����Ƃ��Ċi�[
		System.out.print("1�Ԗڂ̐��l�����:");
		String str = br.readLine();
		// num1(�����^)�ɕϊ����Ċi�[
		double num1 = Double.parseDouble(str);

		// 2�ڂ̒l��num2�Ɋi�[
		System.out.print("2�Ԗڂ̐��l�����:");
		str = br.readLine();
		double num2 = Double.parseDouble(str);

		// ���Z�L����calc(String)�Ɋi�[
		System.out.print("���Z�̕���(���Z:+�A���Z:-�A��Z:*�A���Z:/�A��]�Z:%)�����:");
		str = br.readLine();
		String calc = str;

		double rs = 0;

		if(calc.equals("+")){ 
			// calc == '+'�Ɠ������߂ł�
			rs = num1 + num2;
		} else if (calc.equals("-")){
			// calc == '-'�Ɠ������߂ł�
			rs = num1 - num2;
		} else if (calc.equals("*")){
			// calc == '*'�Ɠ������߂ł�
			rs = num1 * num2;
		} else if (calc.equals("/")){
			// calc == '/'�Ɠ������߂ł�
			rs = num1 / num2;
		} else if (calc.equals("%")){
			// calc == '%'�Ɠ������߂ł�
			rs = num1 % num2;
		} else {
			System.out.println("���Z�̕������Ⴄ��I");
			System.exit(0);
		}
		
		System.out.println(num1 + calc + num2 + "�̌��ʂ�" + rs + "�ł��B");
		
	}
}