import java.io.*;

class Sample14 {
	public static void main(String[] args) throws IOException {
		//�������L�q;
		
		//�L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		System.out.println("a����Ab�܂ł̍��v:");
		System.out.println("a����͂���:");			
		String str = br.readLine();
		int a = Integer.parseInt(str);
		System.out.println("b����͂���:");
		str = br.readLine();
		int b = Integer.parseInt(str);

		int result = 0;
		
		/*int i = a;
		while(a <= b){
			if(a % 2 == 0){
				result = result + a;
			}else{
				result = result + 0;
			}
			a++;
		}
		*/
		

		for(int i = a;i <= b;i++){
			if(i % 2 == 0){
				result = result + i;
			}else{
				result = result + 0;
			}	
		}
		

		System.out.println(a + "����" + b + "�܂ŋ����̍��v��:" + result);
	}
}