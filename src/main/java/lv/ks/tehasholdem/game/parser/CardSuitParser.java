package lv.ks.tehasholdem.game.parser;

import lv.ks.tehasholdem.game.enums.CardRank;
import lv.ks.tehasholdem.game.enums.CardSuit;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static lv.ks.tehasholdem.game.enums.CardSuit.*;

@Service
public class CardSuitParser {

	private static final Map<Character, CardSuit> CARD_SUITS_MAP = new HashMap<>();

	static {
		CARD_SUITS_MAP.put('h', HEARTS);
		CARD_SUITS_MAP.put('d', DIAMONDS);
		CARD_SUITS_MAP.put('c', CLUBS);
		CARD_SUITS_MAP.put('s', SPADES);
	}

	public CardSuit parseCardRank(Character cardSuit) {
		return Optional.ofNullable(CARD_SUITS_MAP.get(cardSuit))
			.orElseThrow(NullPointerException::new);
	}

	public Map<Character, CardSuit> getCardSuitMap() {
		return CARD_SUITS_MAP;
	}

}
