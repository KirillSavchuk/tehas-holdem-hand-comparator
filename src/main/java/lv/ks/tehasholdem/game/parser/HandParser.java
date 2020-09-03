package lv.ks.tehasholdem.game.parser;

import lv.ks.tehasholdem.game.entity.Card;
import lv.ks.tehasholdem.game.entity.Hand;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;

import static lv.ks.tehasholdem.game.common.GameRegex.HAND_PATTERN;

@Service
public class HandParser {

	public Hand getHand(String hand) {
		Matcher cardsMather = HAND_PATTERN.matcher(hand);
		if (!cardsMather.matches()) {
			throw new NullPointerException();
		}
//		CardParser.getCards(cardsMather);
		return null;
	}

}
