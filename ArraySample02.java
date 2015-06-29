import java.io.*;

class ArraySample02 {
	public static void main(String[] args) throws IOException {
		// ˆ—‚ğ‹Lq;
		
		// ”z—ñ‚ÌŒ^‚¨‚æ‚Ñ”z—ñ–¼‚ÌŒˆ’è(éŒ¾)
		String[] fortune;
		// —v‘f”‚ÌŒˆ’è
		fortune = new String[5];
		// ’l‚Ì‘ã“ü
		fortune[0] = "‘å‹g";
		fortune[1] = "‹g";
		fortune[2] = "’†‹g";
		fortune[3] = "¬‹g";
		fortune[4] = "‹¥";

		
		// —”‚Ìæ‚è“¾‚é(0`4)
		int hit = (int)(Math.random() * 5);

		System.out.print("¡“ú‚Ì‚ ‚È‚½‚Ì‰^¨‚Íu" + fortune[hit] + "v‚Å‚·B");
		
	}
}