import java.io.*;

class Sample13 {
	public static void main(String[] args) throws IOException {
		// ˆ—‚ğ‹Lq;
		
		// ƒL[ƒ{[ƒh“ü—Í‚Ìó‚¯•t‚¯
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		// ‡@@x“ü—Í
		String str = br.readLine();
		int x = Integer.parseInt(str);
		
		// ‡A@y“ü—Í
		str = br.readLine();
		int y = Integer.parseInt(str);

		int L,S = 0;
		
		// ‡B@x‚Æy”ä‚×‚é
		if(x > y){			
			L = x;		// ‡C		
			S = y;		// ‡D
		} else {			
			L = y;		// ‡E			
			S = x;		// ‡F
		}

		// ‡GE‡H
		System.out.println("‘å:" + L);
		System.out.println("¬:" + S);
		
	}
}