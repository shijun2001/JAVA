import java.io.*;

class Lesson06_05 {
	public static void main(String[] args) throws IOException {
		//�������L�q;
		
		//�L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		System.out.println("2�ȏ�̐�������͂��ĉ�����:");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		int i;		

		for(i = 2;i < num && (num % i != 0);i++);

		if(i == num){
			str =  "�͑f���ł��B";
		}else{
			str =  "�͑f���ł͂���܂���B";
		}
		
		System.out.println(num + str);
	}
}