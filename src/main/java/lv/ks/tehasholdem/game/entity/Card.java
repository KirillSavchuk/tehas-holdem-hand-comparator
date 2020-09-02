package lv.ks.tehasholdem.game.entity;

import lombok.Value;
import lv.ks.tehasholdem.game.enums.CardRank;
import lv.ks.tehasholdem.game.enums.CardSuit;

@Value
public class Card {

	CardRank rank;
	CardSuit suit;

}
