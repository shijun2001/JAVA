import java.io.*;

class Template {
	public static void main(String[] args) throws IOException {
		//�������L�q;
		
		//�L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		System.out.println("a����Ab�܂ł̌J��Ԃ�:");
		System.out.println("a����͂���:");			
		String str = br.readLine();
		int a = Integer.parseInt(str);
		System.out.println("b����͂���:");
		str = br.readLine();
		int b = Integer.parseInt(str);
		System.out.println("�J��Ԃ�����:");

		/*while(a < b){
			System.out.println(a + "�Ԗڂ̌J��Ԃ�");
			a = a + 2;
			b = b + 1;
		}
		*/

		for(int i = a;i < b;i+=10){
			b = b + 2;
			System.out.println(i + "�Ԗڂ̌J��Ԃ�");
		}
	}
}