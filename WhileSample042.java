import java.io.*;

class WhileSample042 {
	public static void main(String[] args) throws IOException {
		// �������L�q;
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			
		// ���l�����
		System.out.print("���lx�����: ");
		String str = br.readLine();
		float a = Float.parseFloat(str);
		System.out.print("���ly�����: ");
		str = br.readLine();
		float b = Float.parseFloat(str);
		System.out.print("���lx�ɉ��Z���鐔�l�����: ");
		str = br.readLine();
		float c = Float.parseFloat(str);
		System.out.print("���ly�ɉ��Z���鐔�l�����: ");
		str = br.readLine();
		float d = Float.parseFloat(str);


		float x = a;
		float y = b;
		int i = 0;	
		
		if(c != d){
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
				System.out.println("�G���[���o�ė���B(c = d)�̏ꍇ�A�������Ȃ�!");
			}
		} else {
			System.out.println("�G���[���o�ė���B(c = d)�̏ꍇ�A�������Ȃ�!");
		}

		System.out.print("�J��Ԃ��񐔂�: " + i + "��ł��B");
	}
}