package ceasar.cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CeasarCipherTest {
	
	private CeasarsCipher ceaserCipher = new CeasarsCipher();

	@Test
	void testCipheredMessageWithOffsetOf12() {
		assertEquals("tai mdq kag fapmk", ceaserCipher.cipher("how are you today", 12));
	}
	
	@Test
	void testEmptyString() {
		assertEquals("", ceaserCipher.cipher("", 12));
	}

}
