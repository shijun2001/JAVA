import java.io.*;

class Sample15 {
	public static void main(String[] args) throws IOException {
		//�������L�q;
		
		//�L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;		

		System.out.println("�O����͂���O�̍��v:");
		System.out.println("���l����͂���:");			
		String str = br.readLine();
		int num = Integer.parseInt(str);

		while(num != 0){
			sum = num + sum;
			str = br.readLine();
			num = Integer.parseInt(str);
		}
		
		System.out.println("���܂ł̍��v��:" + sum);
	}
}