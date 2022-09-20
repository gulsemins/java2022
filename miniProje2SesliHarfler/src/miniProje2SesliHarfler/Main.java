package miniProje2SesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'A';
		char[] kalın = { 'A', 'I', 'O', 'U' };
		char[] ince = { 'E', 'İ', 'Ö', 'Ü' };
		boolean seslımı = true;

		for (int i = 0; i < 4; i++) {
			if (harf == kalın[i]) {
				seslımı = true;
				break; // yapmak zorundayım çünkü her harfi tek tek dolaşıyor.

			} else if (harf == ince[i]) {
				seslımı = false;
				break;
			} else {
				System.out.println("Geçersiz harf.");
				return;
			}
		}

		if (seslımı == true) {
			System.out.println("Kalin sesli");
		} else if (seslımı == false) {
			System.out.println("İnce sesli");
		}
		
	}

}
