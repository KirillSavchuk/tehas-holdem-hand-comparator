package lv.ks.tehasholdem.game.parser;

import lombok.Getter;
import lv.ks.tehasholdem.game.enums.CardRank;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static lv.ks.tehasholdem.game.enums.CardRank.*;

@Service
public class CardRankParser {

	private static final Map<Character, CardRank> CARD_RANKS_MAP = new HashMap<>();

	static {
		CARD_RANKS_MAP.put('A', ACE);
		CARD_RANKS_MAP.put('K', KING);
		CARD_RANKS_MAP.put('Q', QUEEN);
		CARD_RANKS_MAP.put('J', JACK);
		CARD_RANKS_MAP.put('T', TEN);
		CARD_RANKS_MAP.put('9', NINE);
		CARD_RANKS_MAP.put('8', EIGHT);
		CARD_RANKS_MAP.put('7', SEVEN);
		CARD_RANKS_MAP.put('6', SEVEN);
		CARD_RANKS_MAP.put('5', FIVE);
		CARD_RANKS_MAP.put('4', FOUR);
		CARD_RANKS_MAP.put('3', THREE);
		CARD_RANKS_MAP.put('2', TWO);
	}

	public CardRank parseCardRank(Character cardRank) {
		return Optional.ofNullable(CARD_RANKS_MAP.get(cardRank))
			.orElseThrow(NullPointerException::new);
	}

}
