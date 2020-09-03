package lv.ks.tehasholdem.game.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandTest {

	@BeforeEach
	void setUp() {
	}

	@Test
	public void hand_shouldCreate() {
		Hand hand = new Hand("Ad4s");
	}
}