import java.io.*;

class WhileSample04 {
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
			if(x < y){
				while(x < y){
					x += c;
					i ++;
					System.out.println("x = " + x + ", y = " + y);
					while(x > y){
						y += d;
						i ++;
						System.out.println("x = " + x + ", y = " + y);	
					}
				}
			} else if(x > y){
				while(x > y){
					y += d;
					i ++;
					System.out.println("x = " + x + ", y = " + y);
					while(x < y){
						x += c;
						i ++;
						System.out.println("x = " + x + ", y = " + y);	
					}
				}
			} else {
				System.out.println("�G���[���o�ė���B(x = y)�̏ꍇ�A�������Ȃ�!");
			}
		} else {
			System.out.println("�G���[���o�ė���B(c = d)�܂�(c & d <= 0)�̏ꍇ�A�������Ȃ�!");
		}

		System.out.println("�J��Ԃ��񐔂�: " + i + "��ł��B");
	}
}