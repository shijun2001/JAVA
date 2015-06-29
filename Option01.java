import java.io.*;

class Option01 {
	public static void main(String[] args) throws IOException {
		// 処理を記述;
		
		// キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// プログラムの意味
		System.out.println("BMIの計算");
			
		// 身長を入力する
		System.out.print("身長(cm)を入力して下さい:");
		String str = br.readLine();
		double height = Double.parseDouble(str);

		// 体重を入力する
		System.out.print("体重(kg)を入力して下さい:");				
		str = br.readLine();
		double weight = Double.parseDouble(str);

		/* 演算公式
		*  標準体重(weight0) = 22 * 身長(m) * 身長(m) 
		*  BMI = 体重(kg) / ((身長(m) * 身長(m)))
		*/
		double weight0,bmi = 0;

		weight0 = 22 * (height/100) * (height/100);
		int weight1 = (int)weight0; 
		System.out.print("標準体重は" + weight1 + "kgで、");

		bmi = weight / ((height/100) * (height/100));		
		int bmi0 = (int)bmi;
		System.out.println("君のBMI指数は" + bmi0 + "です。");


		/* 判断標準
		*  16未満:痩せすぎ
		*  16 ～ 17未満: 痩せ
		*  17 ～ 18.5未満: 痩せ気味
		*  18.5 ～ 25未満: 標準
		*  25 ～ 30未満: 肥満1
		*  30 ～ 35未満: 肥満2
		*  35 ～ 40未満: 肥満3
		*  40より大きい: 肥満4
		*/
		if(height >=30 && height <= 250){
			if(bmi < 16){
				System.out.println("***　検定結果:痩せすぎです。***");
			} else if(bmi >= 16 && bmi < 17){
				System.out.println("***　検定結果:痩せです。***");
			} else if(bmi >= 17 && bmi < 18.5){
				System.out.println("***　検定結果:痩せ気味です。***");
			} else if(bmi >= 18.5 && bmi < 25){
				System.out.println("***　検定結果:標準です。***");
			} else if(bmi >= 25 && bmi < 30){
				System.out.println("***　検定結果:肥満1です。***");
			} else if(bmi >= 30 && bmi < 35){
				System.out.println("***　検定結果:肥満2です。***");
			} else if(bmi >= 35 && bmi < 40){
				System.out.println("***　検定結果:肥満3です。***");
			} else if(bmi >= 40){
				System.out.println("***　検定結果:肥満4です。***");
			} else {
				System.out.println("該当なし。");
			}
		} else {
			System.out.println("身長を一回確認して下さい。");
		}
	}
}