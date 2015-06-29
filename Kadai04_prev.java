import java.io.*;

class Kadai04_prev {
	public static void main(String[] args) throws IOException {
		// 処理を記述;
		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// ジャンケンプログラム
		System.out.println("ジャンケンプログラム"); 
		System.out.println("0:グー、1:チョキ、2:パー、999:抜ける");
	
		String str = br.readLine();
		int player = Integer.parseInt(str);

		while (player != 999){
			int cpu = (int)(Math.random()*3);

			if(cpu == 0 && player == 2){
				System.out.println("playerの勝ち");
			} else if(cpu == 1 && player == 0){
				System.out.println("playerの勝ち");
			} else if(cpu == 2 && player == 1){
				System.out.println("playerの勝ち");
			} else if(cpu == 0 && player == 1){
				System.out.println("playerの負け");
			} else if(cpu == 1 && player == 2){
				System.out.println("playerの負け");
			} else if(cpu == 2 && player == 0){
				System.out.println("playerの負け");
			} else if(cpu == 0 && player == 0){
				System.out.println("あいこ");
			} else if(cpu == 1 && player == 1){
				System.out.println("あいこ");
			} else{
				System.out.println("あいこ");
			}

			str = br.readLine();
			player = Integer.parseInt(str);
						
		}	
	}
}


じゃんけんを効率よく。。。。
	player = Integer.parseInt(str);
	cpu = (int)(Math.random()*3);

	int judge = player - cpu;
	// p:0 c:0,p:1 c:1,p:2 c:2
	if(judge == 0){
		System.out.println("あいこ");
	} else if(judge == -1 || judge == 2){
		System.out.println("playerの勝ち");
	} else if{judge == 1 || judge == -2){
		System.out.println("playerの負け");
	} else{
		System.out.println("正しく入力！");
	}

//playerが勝ちのバターン
//	p:0 c:1 p - c = -1
//	p:1 c:2 p - c = -1
//	p:2 c:0 p - c = 2

//playerが負けのバターン	
//	p:0 c:2 p - c = -2
//	p:1 c:0 p - c = 1
//	p:2 c:1 p - c = 1	