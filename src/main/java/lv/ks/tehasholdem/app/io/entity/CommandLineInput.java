package lv.ks.tehasholdem.app.io.entity;

import lombok.Value;
import lv.ks.tehasholdem.game.entity.Board;
import lv.ks.tehasholdem.game.entity.Hand;

import java.util.List;

@Value
public class CommandLineInput {

	Board board;
	List<Hand> hands;

}
