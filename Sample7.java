import java.io.*;

class Sample7 {
	public static void main(String[] args) throws IOException {
	
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		String str = br.readLine();
		// �����l�iInt�j�ւ̕ϊ�
		int num = Integer.parseInt(str);
		
		//num = num * 3;
		// 3�{�����l���o��
		//System.out.println(num);

		// �u�Z�Z��3�{�����灢���ł��v�Əo��
		//System.out.println(num + "��3�{������" + (num * 3) + "�ł�");

		// num2 ���@num�@�R�s�[
		int num2 = num;

		// num2��3�{����
		num2 = num * 3;

		System.out.println(num + "��3�{�����" + num2 + "�ł�");
		
	}
}