package ceasar.cipher;

public class Main {

	public static void main(String[] args) {
		
		String message = "how are you today";
		int offset = 12;
		
		CeasarsCipher ceasersCipher = new CeasarsCipher();
		String cipheredMessage = ceasersCipher.cipher(message, offset);
		
		System.out.println("Message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Ciphered message: " + cipheredMessage);
	}

}
