import java.io.*;

class ArraySample02 {
	public static void main(String[] args) throws IOException {
		// 処理を記述;
		
		// 配列の型および配列名の決定(宣言)
		String[] fortune;
		// 要素数の決定
		fortune = new String[5];
		// 値の代入
		fortune[0] = "大吉";
		fortune[1] = "吉";
		fortune[2] = "中吉";
		fortune[3] = "小吉";
		fortune[4] = "凶";

		
		// 乱数の取り得る(0〜4)
		int hit = (int)(Math.random() * 5);

		System.out.print("今日のあなたの運勢は「" + fortune[hit] + "」です。");
		
	}
}