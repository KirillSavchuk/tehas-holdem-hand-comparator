package lv.ks.tehasholdem.game.common;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class GameRegex {

	public static final String CARD_RANK = asGroup("A|K|Q|J|T|[2-9]");

	public static final String CARD_SUIT = asGroup("h|d|c|s");

	public static final String HAND = asGroup(CARD_RANK + CARD_SUIT);

	public static final String BOARD = asGroup(HAND.repeat(5));

	public static String asGroup(String regex) {
		return String.format("(%s)", regex);
	}

}
