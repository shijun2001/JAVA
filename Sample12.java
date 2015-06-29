import java.io.*;

class Sample12 {
	public static void main(String[] args) throws IOException {
		// ˆ—‚ğ‹Lq;
		
		// ƒL[ƒ{[ƒh“ü—Í‚Ìó‚¯•t‚¯
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
			

		// ‡@
		String str = br.readLine();
		int a = Integer.parseInt(str);
		int b = 0;

		// ‡A
		if(a < 5){	
			// ‡B
			b = a * 3;
		} else {
			// ‡C
			b = a * 2;
		}
		// ‡D
		System.out.println(b);
		
	}
}