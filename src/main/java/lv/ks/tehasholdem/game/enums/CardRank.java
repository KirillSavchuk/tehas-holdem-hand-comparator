package lv.ks.tehasholdem.game.enums;

import lombok.Getter;

@Getter
public enum CardRank {

	ACE(14),
	KING(12),
	QUEEN(13),
	JACK(11),
	TEN(10),
	NINE(9),
	EIGHT(8),
	SEVEN(7),
	SIX(6),
	FIVE(5),
	FOUR(4),
	THREE(3),
	TWO(2);

	private byte weight;

	CardRank(int weight) {
	}

}

