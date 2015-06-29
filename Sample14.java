import java.io.*;

class Sample14 {
	public static void main(String[] args) throws IOException {
		//処理を記述;
		
		//キーボード入力の受け付け
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		System.out.println("aから、bまでの合計:");
		System.out.println("aを入力して:");			
		String str = br.readLine();
		int a = Integer.parseInt(str);
		System.out.println("bを入力して:");
		str = br.readLine();
		int b = Integer.parseInt(str);

		int result = 0;
		
		/*int i = a;
		while(a <= b){
			if(a % 2 == 0){
				result = result + a;
			}else{
				result = result + 0;
			}
			a++;
		}
		*/
		

		for(int i = a;i <= b;i++){
			if(i % 2 == 0){
				result = result + i;
			}else{
				result = result + 0;
			}	
		}
		

		System.out.println(a + "から" + b + "まで偶数の合計は:" + result);
	}
}