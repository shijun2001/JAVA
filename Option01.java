import java.io.*;

class Option01 {
	public static void main(String[] args) throws IOException {
		// �������L�q;
		
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// �v���O�����̈Ӗ�
		System.out.println("BMI�̌v�Z");
			
		// �g������͂���
		System.out.print("�g��(cm)����͂��ĉ�����:");
		String str = br.readLine();
		double height = Double.parseDouble(str);

		// �̏d����͂���
		System.out.print("�̏d(kg)����͂��ĉ�����:");				
		str = br.readLine();
		double weight = Double.parseDouble(str);

		/* ���Z����
		*  �W���̏d(weight0) = 22 * �g��(m) * �g��(m) 
		*  BMI = �̏d(kg) / ((�g��(m) * �g��(m)))
		*/
		double weight0,bmi = 0;

		weight0 = 22 * (height/100) * (height/100);
		int weight1 = (int)weight0; 
		System.out.print("�W���̏d��" + weight1 + "kg�ŁA");

		bmi = weight / ((height/100) * (height/100));		
		int bmi0 = (int)bmi;
		System.out.println("�N��BMI�w����" + bmi0 + "�ł��B");


		/* ���f�W��
		*  16����:��������
		*  16 �` 17����: ����
		*  17 �` 18.5����: �����C��
		*  18.5 �` 25����: �W��
		*  25 �` 30����: �얞1
		*  30 �` 35����: �얞2
		*  35 �` 40����: �얞3
		*  40���傫��: �얞4
		*/
		if(height >=30 && height <= 250){
			if(bmi < 16){
				System.out.println("***�@���茋��:���������ł��B***");
			} else if(bmi >= 16 && bmi < 17){
				System.out.println("***�@���茋��:�����ł��B***");
			} else if(bmi >= 17 && bmi < 18.5){
				System.out.println("***�@���茋��:�����C���ł��B***");
			} else if(bmi >= 18.5 && bmi < 25){
				System.out.println("***�@���茋��:�W���ł��B***");
			} else if(bmi >= 25 && bmi < 30){
				System.out.println("***�@���茋��:�얞1�ł��B***");
			} else if(bmi >= 30 && bmi < 35){
				System.out.println("***�@���茋��:�얞2�ł��B***");
			} else if(bmi >= 35 && bmi < 40){
				System.out.println("***�@���茋��:�얞3�ł��B***");
			} else if(bmi >= 40){
				System.out.println("***�@���茋��:�얞4�ł��B***");
			} else {
				System.out.println("�Y���Ȃ��B");
			}
		} else {
			System.out.println("�g�������m�F���ĉ������B");
		}
	}
}