package lv.ks.tehasholdem.game.exception;

import lv.ks.tehasholdem.game.enums.CardRank;

import java.util.Map;
import java.util.stream.Collectors;

public class CardRankParsingException extends Exception {

	public CardRankParsingException(String errorMessage) {
		super("Incorrect CardRank! Possible values = ");

	}

	private <E> String getPossibleValues(Map<Character, CardRank> cardValueMap) {
		return cardValueMap.entrySet().stream().map(map ->
			String.format("%s=%s", map.getKey(), map.getValue())
		).collect(Collectors.joining(","));
	}


}
