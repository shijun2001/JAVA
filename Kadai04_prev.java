import java.io.*;

class Kadai04_prev {
	public static void main(String[] args) throws IOException {
		// �������L�q;
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// �W�����P���v���O����
		System.out.println("�W�����P���v���O����"); 
		System.out.println("0:�O�[�A1:�`���L�A2:�p�[�A999:������");
	
		String str = br.readLine();
		int player = Integer.parseInt(str);

		while (player != 999){
			int cpu = (int)(Math.random()*3);

			if(cpu == 0 && player == 2){
				System.out.println("player�̏���");
			} else if(cpu == 1 && player == 0){
				System.out.println("player�̏���");
			} else if(cpu == 2 && player == 1){
				System.out.println("player�̏���");
			} else if(cpu == 0 && player == 1){
				System.out.println("player�̕���");
			} else if(cpu == 1 && player == 2){
				System.out.println("player�̕���");
			} else if(cpu == 2 && player == 0){
				System.out.println("player�̕���");
			} else if(cpu == 0 && player == 0){
				System.out.println("������");
			} else if(cpu == 1 && player == 1){
				System.out.println("������");
			} else{
				System.out.println("������");
			}

			str = br.readLine();
			player = Integer.parseInt(str);
						
		}	
	}
}


����񂯂�������悭�B�B�B�B
	player = Integer.parseInt(str);
	cpu = (int)(Math.random()*3);

	int judge = player - cpu;
	// p:0 c:0,p:1 c:1,p:2 c:2
	if(judge == 0){
		System.out.println("������");
	} else if(judge == -1 || judge == 2){
		System.out.println("player�̏���");
	} else if{judge == 1 || judge == -2){
		System.out.println("player�̕���");
	} else{
		System.out.println("���������́I");
	}

//player�������̃o�^�[��
//	p:0 c:1 p - c = -1
//	p:1 c:2 p - c = -1
//	p:2 c:0 p - c = 2

//player�������̃o�^�[��	
//	p:0 c:2 p - c = -2
//	p:1 c:0 p - c = 1
//	p:2 c:1 p - c = 1	