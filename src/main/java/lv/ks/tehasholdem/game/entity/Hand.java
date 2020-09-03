package lv.ks.tehasholdem.game.entity;

import lombok.Getter;
import lv.ks.tehasholdem.game.parser.CardParser;

import java.util.List;
import java.util.regex.Matcher;

import static lv.ks.tehasholdem.game.common.GameRegex.HAND_PATTERN;

@Getter
public class Hand {

	List<Card> cards;

	public Hand(String cards) {

	}

}
