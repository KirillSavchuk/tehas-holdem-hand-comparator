package lv.ks.tehasholdem.app.core.entity;

import lombok.Value;
import lv.ks.tehasholdem.game.entity.Board;
import lv.ks.tehasholdem.game.entity.Hand;

import java.util.List;

@Value
public class GameInput {

	Board board;
	List<Hand> hands;

}
