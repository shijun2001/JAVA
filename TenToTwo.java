import java.io.*;

class TenToTwo {
	public static void main(String[] args) throws IOException {
		// �������L�q;
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// �W�����P���v���O����
		System.out.println("10�i����2�i���ɕϊ�����v���O����"); 
		System.out.print("10�i������͂���:"); 

		String str = br.readLine();
		int num = Integer.parseInt(str);

		int i,j = 0;
		String k = "";
		String l = "";

		while(num >= 1){
			if(num % 2 == 0){
				j = 0;
				k = String.valueOf(j);
				l = k + l;
			} else {
				j = 1;
				k = String.valueOf(j);
				l = k + l;
			}
			num = num / 2;		
		}
		System.out.println(l);	
	}
}