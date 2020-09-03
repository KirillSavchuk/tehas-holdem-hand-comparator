package lv.ks.tehasholdem.game.common;

import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RegExUtils;

import java.util.regex.Pattern;

@NoArgsConstructor
public class GameRegex {

	private static final String CARD_RANK = asGroup("A|K|Q|J|T|[2-9]");

	private static final String CARD_SUIT = asGroup("h|d|c|s");

	private static final String CARD = CARD_RANK + CARD_SUIT;

	private static final String HAND = CARD.repeat(2); //TODO: NUMBER_OF_CARDS_IN_HAND

	private static final String BOARD = CARD.repeat(5); //TODO: NUMBER_OF_CARDS_ON_TEHAS_HOLDEM_BOARD

	public static final Pattern CARD_PATTERN = Pattern.compile(capture(CARD));

	public static final Pattern HAND_PATTERN = Pattern.compile(capture(HAND));

	public static final Pattern BOARD_PATTERN = Pattern.compile(capture(BOARD));

	protected static String asGroup(String regex) {
		return String.format("(%s)", regex);
	}

	protected static String capture(String regex) {
		return String.format("^%s$", regex);
	}

}
