import java.io.*;

class Kadai02 {
	public static void main(String[] args) throws IOException {
		// �������L�q;
		
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// �v���O�����̈Ӗ�
		System.out.println("�`�`�`���͎l�����Z�̃v���O��������!�`�`�`");

		// str�ɕ����Ƃ��Ċi�[
		System.out.println("1�Ԗڂ̐��l����͂���:");
		String str = br.readLine();		
		// num1(�����^)�ɕϊ����Ċi�[
		int num1 = Integer.parseInt(str);

		// 2�ڂ̒l��num2�Ɋi�[
		System.out.println("2�Ԗڂ̐��l����͂���:");
		str = br.readLine();
		int num2 = Integer.parseInt(str);

		// ���Z�L����calc(String)�Ɋi�[
		System.out.println("���Z�̕���(���Z:+�A���Z:-�A��Z:*�A���Z:/�A��]�Z:%)����͂���:");
		str = br.readLine();		
		String calc = str;

		int rs = 0;		

		if(calc.equals("+")){ 
			// calc == '+'�Ɠ������߂ł�
			rs = num1 + num2;		
		} else if (calc.equals("-")){
			rs = num1 - num2;
		} else if (calc.equals("*")){
			rs = num1 * num2;
		} else if (calc.equals("/")){
			rs = num1 / num2;
		} else if (calc.equals("%")){
			rs = num1 % num2;
		} else {
			System.out.println("�Y���Ȃ�");
		}

		System.out.println("���Z�̌��ʂ�" + rs + "�ł��B");

	}
}