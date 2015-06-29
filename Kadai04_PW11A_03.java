import java.io.*;

class Kadai04_PW11A_03 {
	public static void main(String[] args) throws IOException {
		// 処理を記述;
		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// ジャンケンプログラム
		System.out.println("ジャンケンプログラム"); 
		System.out.println("0:グー、1:チョキ、2:パー、999:抜ける");
	
		String no = "y";
		while (no.equals("y")){

			String str = br.readLine();
			int player = Integer.parseInt(str);

			int win = 0;
			int lost = 0;
			int i = 0;
			
			while (player != 999 && win < 2 && lost < 2){
				if(player != 0 && player != 1 && player != 2 && player != 999){
					System.out.println("正しく入力！");
					break;
				}

				int cpu = (int)(Math.random()*3);

				String cpuin = "";
				String playerin = "";

				switch(cpu){
					case 0: cpuin = "グー";
					break;
					case 1: cpuin = "チョキ";
					break;
					case 2: cpuin = "パー";
					break;					}
				switch(player){
					case 0: playerin = "グー";
					break;
					case 1: playerin = "チョキ";
					break;
					case 2: playerin = "パー";
					break;
				}

				int judge = player - cpu;
				
				if(judge == -1 || judge == 2){
					win++;
					i++;
					System.out.println("CPUは\"" + cpuin + "\"を出す、Playerは\"" + playerin + "\"を出す、" + win + "回Win！");
				} else if(judge == 1 || judge == -2){
					lost++;
					i++;
					System.out.println("CPUは\"" + cpuin + "\"を出す、Playerは\"" + playerin + "\"を出す、" + lost + "回Lost！");
				} else {
					System.out.println("CPUは\"" + cpuin + "\"を出す、Playerは\"" + playerin + "\"を出す。あいこ！");
					i++;
				}

				if(win < 2 && lost < 2){
					System.out.println("続ける:");
					str = br.readLine();
					player = Integer.parseInt(str);			
				}
			}

			if(win == 2){
				System.out.println("総合" + i + "回です。Player Win:" + win + "回、Player Lost:" + lost + "回。Playerの勝ち!");
			} else if(lost == 2){
				System.out.println("総合" + i + "回です。Player Win:" + win + "回、Player Lost:" + lost + "回。Playerの負け!");
			} else {
				System.out.println("中断されました。");
			}

			System.out.println("もう一回やりたい？(y/n)");
			no = br.readLine();

			while(!no.equals("n") && !no.equals("y")){
				System.out.println("正しく入力！→→\"y\"←←や→→\"n\"←←だけ入力できる！");
				no = br.readLine();
			}
			
			if(no.equals("y")) {
				System.out.println("今から繰り返す～～～～～");
				System.out.println("0:グー、1:チョキ、2:パー、999:抜ける");
			} else {
				System.out.println("中断されました。");
			}
			
		}	
	}
}