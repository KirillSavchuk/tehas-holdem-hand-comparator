package lv.ks.tehasholdem.game.exception;

import lv.ks.tehasholdem.game.enums.CardRank;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CardValueCommonParsingException extends Exception {

	public <E> CardValueCommonParsingException(String errorMessage, Map<Character, E> cardValueMap) {
		super("Incorrect CardRank! Possible values = ");
	}

	private <E> String getPossibleValues(Map<Character, E> cardValueMap) {
		return cardValueMap.entrySet().stream().map(map ->
			String.format("%s=%s", map.getKey(), map.getValue())
		).collect(Collectors.joining(","));
	}


}
