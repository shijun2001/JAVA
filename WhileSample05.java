import java.io.*;

class WhileSample05 {
	public static void main(String[] args) throws IOException {
		// �������L�q;
		int cpu = (int)(Math.random()*100)+1;

		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		// ���l�����
		System.out.print("���la�����: ");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		int i = 0;	
		
		while(cpu != num) {
			if(cpu > num) {
				i ++;
				System.out.println("�����Ƒ傫���I");
			} else {
				i ++;
				System.out.println("�����Ə������I");
			}
			
			// �ēxnum����
			str = br.readLine();
			num = Integer.parseInt(str);
		}

		System.out.println(i + "�������A������I");				
					
	}
}