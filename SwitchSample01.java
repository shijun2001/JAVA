import java.io.*;

class SwitchSample01 {
	public static void main(String[] args) throws IOException {
		// �������L�q;
		
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		// num1����(�����񂩂�ϊ�)
		String str = br.readLine();
		double num1 = Double.parseDouble(str);

		// calc����(�����̂܂�)
		String calc = br.readLine();		
		
		// num2����(�����񂩂�ϊ�)
		str = br.readLine();
		double num2 = Double.parseDouble(str);

		double rs = 0;

		switch(calc){
			case "+":
				rs = num1 + num2;
				break;
			case "-":
				rs = num1 - num2;
				break;
			case "*":
				rs = num1 * num2;
				break;
			case "/":
				rs = num1 / num2;
				break;
			case "%":
				rs = num1 % num2;
				break;
			default:	// �Y���Ȃ��̂Ƃ�
				System.out.println("�G���[");
				break;
		}

		System.out.println("���ʂ�" + rs + "�ł��B");

	}
}