import java.io.*;

class Kadai03_PW11A_03 {
	public static void main(String[] args) throws IOException {
		// �������L�q;		
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�~���m������͂��ĉ�����(0�`100):");
			
		String str = br.readLine();
		// ���l�iInt�j�ւ̕ϊ�
		double num = Double.parseDouble(str);

		// if��0�܂���1�܂�2�̔���
		if(num >= 80 && num <= 100){
			System.out.println("�~���m����" + num + "%�ł��B" + "�P�����Q���ĉ������B");
		} else if(num >= 40){
			System.out.println("�~���m����" + num + "%�ł��B" + "�܂肽���ݎP�����Q���ĉ������B");
		} else if(num >= 0){
			System.out.println("�~���m����" + num + "%�ł��B" + "�P�͕s�v�ł��B");	
		} else {
			System.out.println("�Y���Ȃ��ł��B");
		}
	}
}