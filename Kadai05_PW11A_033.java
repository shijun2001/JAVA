import java.io.*;

class Kadai05_PW11A_033 {
	public static void main(String[] args) {
		// �������L�q;
		
		// �V�����ϐ���錾����
		int[] test = new int[5];
		int i;

		// �l��������
		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 75;
		
		// �ɒl�̂��ߔ�ׂ�
		int max = test[0];
		int min = test[0];
		for(i = 0;i<5;i++){
		    if(test[i] >= max){
				max = test[i];
			}
			if(test[i] <= min){
				min = test[i];
			}
		}		

		// ���ϒl�̌v�Z
		double avg = 0;
		int sum = 0;
		int count = 0;
		for(i = 0;i < 5;i++){
			sum = test[i] + sum;
			count++;
		}
		avg = (double)sum / count;

		// �o�͂���
		for(i = 0;i<5;i++){
			System.out.println((i+1) + "�Ԗڂ̐l�̓_����" + test[i] + "�ł��B");
		}
		System.out.println("�ō��_����" + max + "�ł��B");
		System.out.println("�Œ�_����" + min + "�ł��B");		
		System.out.println("���ϓ_����" + avg + "�ł��B");
	}
}