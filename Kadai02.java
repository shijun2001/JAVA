import java.io.*;

class Kadai02 {
	public static void main(String[] args) throws IOException {
		// ˆ—‚ğ‹Lq;
		
		// ƒL[ƒ{[ƒh“ü—Í‚Ìó‚¯•t‚¯
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		// ƒvƒƒOƒ‰ƒ€‚ÌˆÓ–¡
		System.out.println("```‰´‚Íl‘¥‰‰Z‚ÌƒvƒƒOƒ‰ƒ€‚¾‚æ!```");

		// str‚É•¶š‚Æ‚µ‚ÄŠi”[
		System.out.println("1”Ô–Ú‚Ì”’l‚ğ“ü—Í‚·‚é:");
		String str = br.readLine();		
		// num1(®”Œ^)‚É•ÏŠ·‚µ‚ÄŠi”[
		int num1 = Integer.parseInt(str);

		// 2‚Â–Ú‚Ì’l‚ğnum2‚ÉŠi”[
		System.out.println("2”Ô–Ú‚Ì”’l‚ğ“ü—Í‚·‚é:");
		str = br.readLine();
		int num2 = Integer.parseInt(str);

		// ‰‰Z‹L†‚ğcalc(String)‚ÉŠi”[
		System.out.println("‰‰Z‚Ì•„†(‰ÁZ:+AŒ¸Z:-AæZ:*AŠ„Z:/Aè—]Z:%)‚ğ“ü—Í‚·‚é:");
		str = br.readLine();		
		String calc = str;

		int rs = 0;		

		if(calc.equals("+")){ 
			// calc == '+'‚Æ“¯‚¶–½—ß‚Å‚·
			rs = num1 + num2;		
		} else if (calc.equals("-")){
			rs = num1 - num2;
		} else if (calc.equals("*")){
			rs = num1 * num2;
		} else if (calc.equals("/")){
			rs = num1 / num2;
		} else if (calc.equals("%")){
			rs = num1 % num2;
		} else {
			System.out.println("ŠY“–‚È‚µ");
		}

		System.out.println("‰‰Z‚ÌŒ‹‰Ê‚Í" + rs + "‚Å‚·B");

	}
}