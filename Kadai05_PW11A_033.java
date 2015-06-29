import java.io.*;

class Kadai05_PW11A_033 {
	public static void main(String[] args) {
		// 処理を記述;
		
		// 新しい変数を宣言する
		int[] test = new int[5];
		int i;

		// 値をあげる
		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 75;
		
		// 極値のため比べる
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

		// 平均値の計算
		double avg = 0;
		int sum = 0;
		int count = 0;
		for(i = 0;i < 5;i++){
			sum = test[i] + sum;
			count++;
		}
		avg = (double)sum / count;

		// 出力する
		for(i = 0;i<5;i++){
			System.out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
		}
		System.out.println("最高点数は" + max + "です。");
		System.out.println("最低点数は" + min + "です。");		
		System.out.println("平均点数は" + avg + "です。");
	}
}