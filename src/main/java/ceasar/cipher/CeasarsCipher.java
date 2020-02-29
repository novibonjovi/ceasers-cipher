package ceasar.cipher;

public class CeasarsCipher {
	
	private static final char LETTER_A = 'a';
	private static final char LETTER_Z = 'z';
	private static final int ALPHABET_SIZE = 26;
	
	public String cipher(String message, int offset) {
//		System.out.println("the offset is set to " + offset); // print initial offset value
		offset %= ALPHABET_SIZE; // prevents offset from exceeding the size of ALPHABET_SIZE. Divide offset by ALPHABET_SIZE and return the remainder.
//		System.out.println("offset = offset % ALPHABET_SIZE > " + offset);
		
		char[] character = message.toCharArray();
		offsetBy(character, offset);
		return new String(character);
	}

	private void offsetBy(char[] character, int offset) {
		for (int i = 0; i < character.length; i++) {
			if (character[i] != ' ') {
				character[i] = offsetChar(character[i], offset, LETTER_A, LETTER_Z);
			}
		}
		
	}

	private char offsetChar(char c, int offset, char letterA, char letterZ) {
		c += offset;
		if (c < LETTER_A) {
			return (char) (c + ALPHABET_SIZE);
		}
		if (c > LETTER_Z) {
			return (char) (c - ALPHABET_SIZE);
		}
		return c;
	}
}
