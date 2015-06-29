import java.io.*;

class Kadai04_PW11A_03 {
	public static void main(String[] args) throws IOException {
		// �������L�q;
		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// �W�����P���v���O����
		System.out.println("�W�����P���v���O����"); 
		System.out.println("0:�O�[�A1:�`���L�A2:�p�[�A999:������");
	
		String no = "y";
		while (no.equals("y")){

			String str = br.readLine();
			int player = Integer.parseInt(str);

			int win = 0;
			int lost = 0;
			int i = 0;
			
			while (player != 999 && win < 2 && lost < 2){
				if(player != 0 && player != 1 && player != 2 && player != 999){
					System.out.println("���������́I");
					break;
				}

				int cpu = (int)(Math.random()*3);

				String cpuin = "";
				String playerin = "";

				switch(cpu){
					case 0: cpuin = "�O�[";
					break;
					case 1: cpuin = "�`���L";
					break;
					case 2: cpuin = "�p�[";
					break;					}
				switch(player){
					case 0: playerin = "�O�[";
					break;
					case 1: playerin = "�`���L";
					break;
					case 2: playerin = "�p�[";
					break;
				}

				int judge = player - cpu;
				
				if(judge == -1 || judge == 2){
					win++;
					i++;
					System.out.println("CPU��\"" + cpuin + "\"���o���APlayer��\"" + playerin + "\"���o���A" + win + "��Win�I");
				} else if(judge == 1 || judge == -2){
					lost++;
					i++;
					System.out.println("CPU��\"" + cpuin + "\"���o���APlayer��\"" + playerin + "\"���o���A" + lost + "��Lost�I");
				} else {
					System.out.println("CPU��\"" + cpuin + "\"���o���APlayer��\"" + playerin + "\"���o���B�������I");
					i++;
				}

				if(win < 2 && lost < 2){
					System.out.println("������:");
					str = br.readLine();
					player = Integer.parseInt(str);			
				}
			}

			if(win == 2){
				System.out.println("����" + i + "��ł��BPlayer Win:" + win + "��APlayer Lost:" + lost + "��BPlayer�̏���!");
			} else if(lost == 2){
				System.out.println("����" + i + "��ł��BPlayer Win:" + win + "��APlayer Lost:" + lost + "��BPlayer�̕���!");
			} else {
				System.out.println("���f����܂����B");
			}

			System.out.println("��������肽���H(y/n)");
			no = br.readLine();

			while(!no.equals("n") && !no.equals("y")){
				System.out.println("���������́I����\"y\"�����⁨��\"n\"�����������͂ł���I");
				no = br.readLine();
			}
			
			if(no.equals("y")) {
				System.out.println("������J��Ԃ��`�`�`�`�`");
				System.out.println("0:�O�[�A1:�`���L�A2:�p�[�A999:������");
			} else {
				System.out.println("���f����܂����B");
			}
			
		}	
	}
}