import java.io.*;

class SixteenToTen {
	public static void main(String[] args) throws IOException {
		// �������L�q;
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// �W�����P���v���O����
		System.out.println("16�i����10�i���ɕϊ�����v���O����"); 
		System.out.print("16�i������͂���:"); 

		String str = br.readLine();
		int num = Integer.parseInt(str,16);


		System.out.println(num);	
	}
}