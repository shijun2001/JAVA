import java.io.*;

class Kadai05_PW11A_03 {
	public static void main(String[] args) throws IOException {
		// 処理を記述;

		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// 配列の個数を入力する
		System.out.print("登録の人数は: ");
		String str = br.readLine();
		int num = Integer.parseInt(str);

		// 新しい配列と変数を宣言する
		int[] test = new int[num];
		int i;

		for(i = 0;i < num;i++){
			System.out.print("第" + (i + 1) + "人の成績は: ");
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
		}

		// 極値のため比べると平均値の計算
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

		// 出力する
		for(i = 0;i < num;i++){
			System.out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
		}
		System.out.println("最高点数は" + max + "です。");
		System.out.println("最低点数は" + min + "です。");		
		System.out.println(num + "人の平均点数は" + avg + "です。");
	}
}