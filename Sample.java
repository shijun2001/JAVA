import java.io.*;

class Sample {
	public static void main(String[] args) throws IOException {
	
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();

		// �����l�iInt�j�ւ̕ϊ�
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		char ch = String(str3);
		
		//num = num * 3;
		// 3�{�����l���o��
		//System.out.println(num);

		// �u�Z�Z��3�{�����灢���ł��v�Əo��
		System.out.println(num1 + ch + num2);
		
	}
}