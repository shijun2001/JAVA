import java.io.*;

class TwoToTen {
	public static void main(String[] args) throws IOException {
		// �������L�q;
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// �W�����P���v���O����
		System.out.println("2�i����10�i���ɕϊ�����v���O����"); 
		System.out.print("2�i������͂���:"); 

		String str = br.readLine();
		int num = Integer.parseInt(str);
		int sum = 0;
		int i = 0;

		while(num != 0){
			sum = (int)(sum + num % 10 * (Math.pow(2,i)));
			num	= num / 10;
			i++;
		}
		System.out.println(sum);	
	}
}