import java.io.*;

class Kadai05_PW11A_03 {
	public static void main(String[] args) throws IOException {
		// �������L�q;

		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// �z��̌�����͂���
		System.out.print("�o�^�̐l����: ");
		String str = br.readLine();
		int num = Integer.parseInt(str);

		// �V�����z��ƕϐ���錾����
		int[] test = new int[num];
		int i;

		for(i = 0;i < num;i++){
			System.out.print("��" + (i + 1) + "�l�̐��т�: ");
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
		}

		// �ɒl�̂��ߔ�ׂ�ƕ��ϒl�̌v�Z
		int max = test[0];
		int min = test[0];
		double avg = 0;
		int sum = 0;
		for(i = 0;i < num;i++){
			sum = test[i] + sum;
		    if(test[i] > max){
				max = test[i];
			}
			if(test[i] < min){
				min = test[i];
			}
		}		
		avg = (double)sum / num;

		// �o�͂���
		for(i = 0;i < num;i++){
			System.out.println((i+1) + "�Ԗڂ̐l�̓_����" + test[i] + "�ł��B");
		}
		System.out.println("�ō��_����" + max + "�ł��B");
		System.out.println("�Œ�_����" + min + "�ł��B");		
		System.out.println(num + "�l�̕��ϓ_����" + avg + "�ł��B");
	}
}