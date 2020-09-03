package lv.ks.tehasholdem.app.core.entity;

import lombok.Value;
import lv.ks.tehasholdem.game.entity.Hand;

import java.util.Map;

@Value
public class GameOutput {

	Map<Integer, Hand> weightedHands;

}
