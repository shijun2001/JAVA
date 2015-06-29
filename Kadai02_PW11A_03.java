import java.io.*;

class Kadai02_PW11A_03 {
	public static void main(String[] args) throws IOException {
		// ˆ—‚ğ‹Lq;
		
		// ƒL[ƒ{[ƒh“ü—Í‚Ìó‚¯•t‚¯
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		// ƒvƒƒOƒ‰ƒ€‚ÌˆÓ–¡
		System.out.println("```‰´‚Íl‘¥‰‰Z‚ÌƒvƒƒOƒ‰ƒ€‚¾‚æ!```");

		// str‚É•¶š‚Æ‚µ‚ÄŠi”[
		System.out.print("1”Ô–Ú‚Ì”’l‚ğ“ü—Í:");
		String str = br.readLine();
		// num1(®”Œ^)‚É•ÏŠ·‚µ‚ÄŠi”[
		double num1 = Double.parseDouble(str);

		// 2‚Â–Ú‚Ì’l‚ğnum2‚ÉŠi”[
		System.out.print("2”Ô–Ú‚Ì”’l‚ğ“ü—Í:");
		str = br.readLine();
		double num2 = Double.parseDouble(str);

		// ‰‰Z‹L†‚ğcalc(String)‚ÉŠi”[
		System.out.print("‰‰Z‚Ì•„†(‰ÁZ:+AŒ¸Z:-AæZ:*AŠ„Z:/Aè—]Z:%)‚ğ“ü—Í:");
		str = br.readLine();
		String calc = str;

		double rs = 0;

		if(calc.equals("+")){ 
			// calc == '+'‚Æ“¯‚¶–½—ß‚Å‚·
			rs = num1 + num2;
		} else if (calc.equals("-")){
			// calc == '-'‚Æ“¯‚¶–½—ß‚Å‚·
			rs = num1 - num2;
		} else if (calc.equals("*")){
			// calc == '*'‚Æ“¯‚¶–½—ß‚Å‚·
			rs = num1 * num2;
		} else if (calc.equals("/")){
			// calc == '/'‚Æ“¯‚¶–½—ß‚Å‚·
			rs = num1 / num2;
		} else if (calc.equals("%")){
			// calc == '%'‚Æ“¯‚¶–½—ß‚Å‚·
			rs = num1 % num2;
		} else {
			System.out.println("‰‰Z‚Ì•„†‚ªˆá‚¤‚æI");
			System.exit(0);
		}
		
		System.out.println(num1 + calc + num2 + "‚ÌŒ‹‰Ê‚Í" + rs + "‚Å‚·B");
		
	}
}