import java.io.*;

class ArraySample01 {
	public static void main(String[] args) throws IOException {
		// 処理を記述;
		
		// 配列の型および配列名の決定(宣言)
		int[] test;
		// 要素数の決定
		test = new int[5];
		// 値の代入
		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 75;

		// SUMに合計を求める
		int sum = test[0] + test[1] + test[2] + test[3] + test[4];

		// for文を使ってSUM2に合計を求める
		int sum2 = 0;
		for(int i = 0;i < 5;i++){
			sum2 = sum2 + test[i];
		}
		
		System.out.println("合計は" + sum + "です");
		System.out.println("合計は" + sum2 + "です");
	}
}