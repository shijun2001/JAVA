import java.io.*;

class ArraySample03 {
	public static void main(String[] args) throws IOException {
		// �������L�q;

		// �L�[�{�[�h���͂̎󂯕t��
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		String[] qus = {"(1) ����܂Ŏ��{���Ă����͋[�����̓_���ƁC���̎����̕��ϓ_�̐��ڂ��l���Ƃɕ\���O���t���쐬����B",
						"(2) ���Ƃ��镪��𒲂ׂ邽�߁C���Ȃ̕��삲�Ƃɓ_�����W�v���C�e����̗���x��5 �i�K�Ɏ��������l���Ƃ̃O���t���쐬����B",
						"(3) �͋[�����̓_�����Ƃɐl���̓x�����z�𒲂ׂ邽�߁C10 �_���݂Ől�����W�v�����O���t���쐬����B",
						"(4) �����w�ɍ��i�����󌱐��̂����CJ �\���Z�ɒʂ��Ă����w���̊������������߂̃O���t���쐬����B"};
		String[] choice = {"�A�D�~�O���t �C�D�o�u���`���[�g �E�D�܂���O���t �G�D�U�z�} �I�D�_�O���t �J�D���[�_�`���[�g",
							"�A�D�~�O���t �C�D�o�u���`���[�g �E�D�܂���O���t �G�D�U�z�} �I�D�_�O���t �J�D���[�_�`���[�g",
							"�A�D�~�O���t �C�D�o�u���`���[�g �E�D�܂���O���t �G�D�U�z�} �I�D�_�O���t �J�D���[�_�`���[�g",
							"�A�D�~�O���t �C�D�o�u���`���[�g �E�D�܂���O���t �G�D�U�z�} �I�D�_�O���t �J�D���[�_�`���[�g"};
		String[] ans = {"�E","�J","�I","�A"};
		int i;
		int right = 0;
		int wrong = 0;
		double result;

		for(i = 0;i < qus.length;i++){
			// ����
			System.out.println(qus[i]);
			System.out.println(choice[i]);

			// �����v��
			String str = br.readLine();

			// ����̔���
			if (str.equals(ans[i])) {
				System.out.println("����!");
				right++;
			} else {
				System.out.println("�s����!");
				wrong++;
			}
		}

		result = (double)right / qus.length;

		System.out.println("�S�Ă�" + qus.length + "�蒆�A" + right + "�肪�����A" 
							+ wrong + "�肪�Ԉ�����A���m����" + (result*100) + "���ł��B");
	}
}