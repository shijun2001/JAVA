
class Sample3 {
	public static void main(String[] args) {
		System.out.print("1+2=");
		System.out.print(1+2);
		System.out.println("です");

		//1+2 = 3 と出力したい
		//"1+2" = 3 はNG

		/*　ヒント
			"1+2=" と 1+2 をくっつける
		*/

		System.out.println("1+2=" + (1+2) + "です");

	}
}