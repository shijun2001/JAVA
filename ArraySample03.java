import java.io.*;

class ArraySample03 {
	public static void main(String[] args) throws IOException {
		// 処理を記述;

		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		String[] qus = {"(1) これまで実施してきた模擬試験の点数と，その試験の平均点の推移を個人ごとに表すグラフを作成する。",
						"(2) 苦手とする分野を調べるため，教科の分野ごとに点数を集計し，各分野の理解度を5 段階に収束した個人ごとのグラフを作成する。",
						"(3) 模擬試験の点数ごとに人数の度数分布を調べるため，10 点刻みで人数を集計したグラフを作成する。",
						"(4) ある大学に合格した受験生のうち，J 予備校に通っていた学生の割合を示すためのグラフを作成する。"};
		String[] choice = {"ア．円グラフ イ．バブルチャート ウ．折れ線グラフ エ．散布図 オ．棒グラフ カ．レーダチャート",
							"ア．円グラフ イ．バブルチャート ウ．折れ線グラフ エ．散布図 オ．棒グラフ カ．レーダチャート",
							"ア．円グラフ イ．バブルチャート ウ．折れ線グラフ エ．散布図 オ．棒グラフ カ．レーダチャート",
							"ア．円グラフ イ．バブルチャート ウ．折れ線グラフ エ．散布図 オ．棒グラフ カ．レーダチャート"};
		String[] ans = {"ウ","カ","オ","ア"};
		int i;
		int right = 0;
		int wrong = 0;
		double result;

		for(i = 0;i < qus.length;i++){
			// 問題提示
			System.out.println(qus[i]);
			System.out.println(choice[i]);

			// 答え要求
			String str = br.readLine();

			// 正誤の判定
			if (str.equals(ans[i])) {
				System.out.println("正解!");
				right++;
			} else {
				System.out.println("不正解!");
				wrong++;
			}
		}

		result = (double)right / qus.length;

		System.out.println("全ての" + qus.length + "題中、" + right + "題が正し、" 
							+ wrong + "題が間違った、正確率が" + (result*100) + "％です。");
	}
}