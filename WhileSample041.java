import java.io.*;

class WhileSample041 {
	public static void main(String[] args) throws IOException {
		// �������L�q;
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		// ���l�����
		System.out.print("���lx�����: ");
		String str = br.readLine();
		int a = Integer.parseInt(str);
		System.out.print("���ly�����: ");
		str = br.readLine();
		int b = Integer.parseInt(str);
		System.out.print("���lx�ɉ��Z���鐔�la�����: ");
		str = br.readLine();
		int c = Integer.parseInt(str);
		System.out.print("���ly�ɉ��Z���鐔�lb�����: ");
		str = br.readLine();
		int d = Integer.parseInt(str);


		int x = a;
		int y = b;
		int i = 0;	
		

		if(c != d && c > 0 && d > 0){
			while(x != y){
				if(x > y){
					y += d;
					i ++;
				} else {
					x += c;
					i ++;
				}
				System.out.println("x = " + x + ", y = " + y);	
			}
		} else {
			System.out.println("�G���[���o�ė���B(c = d)�܂�(c & d <= 0)�̏ꍇ�A�������Ȃ�!");
		}

		System.out.println("�J��Ԃ��񐔂�: " + i + "��ł��B");
	}
}