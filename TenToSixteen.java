import java.io.*;

class TenToSixteen {
	public static void main(String[] args) throws IOException {
		// �������L�q;
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// �W�����P���v���O����
		System.out.println("10�i����16�i���ɕϊ�����v���O����"); 
		System.out.print("10�i������͂���:"); 

		String str = br.readLine();
		int num = Integer.parseInt(str);

		int i = 0;
		String k = "";
		String result = "";

		while(num >= 1){
			i = num % 16;
			k = String.valueOf(i);
			switch(i){
				case 10: k = "A";
				break;
				case 11: k = "B";
				break;
				case 12: k = "C";
				break;
				case 13: k = "D";
				break;
				case 14: k = "E";
				break;
				case 15: k = "F";
				break;
			}
			result = k + result;		
			num = num / 16;		
		}
		System.out.println(result);	
	}
}