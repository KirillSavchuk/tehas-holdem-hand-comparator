package lv.ks.tehasholdem.app.io.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lv.ks.tehasholdem.app.core.entity.GameInput;
import lv.ks.tehasholdem.game.entity.Board;
import lv.ks.tehasholdem.game.entity.Hand;
import lv.ks.tehasholdem.game.validator.BoardValidator;
import lv.ks.tehasholdem.game.validator.HandValidator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.function.Predicate.not;

@Slf4j
@Service
@AllArgsConstructor
public class CommandLineInputArgumentParser {

	private static final int VALID_GAME_INPUT_ARGUMENTS_COUNT = 2;

	private final BoardValidator boardValidator;
	private final HandValidator handValidator;

	public GameInput parse(String... args) {
		if (args.length + 1 < VALID_GAME_INPUT_ARGUMENTS_COUNT) {
			throw new NullPointerException(); // TODO
		}

		String notCheckedGameBoard = this.getNotCheckedBoardFromInputArgs(args);
		Board gameBoard = this.getGameBoard(notCheckedGameBoard);

		List<String> notCheckedHands = this.getNotCheckedHandsFromInputArgs(args);
		List<Hand> gameHands = this.getGameHands(notCheckedHands);

		return null;
	}

	protected Board getGameBoard(String notCheckedGameBoard) throws NullPointerException {
//		if (!boardValidator.check(notCheckedGameBoard)) {
//			throw new NullPointerException(); // TODO
//		}
		return new Board(notCheckedGameBoard);
	}

	protected String getNotCheckedBoardFromInputArgs(String... args) {
		return args[0];
	}

	protected List<Hand> getGameHands(List<String> notCheckedGameHands) throws NullPointerException {
//		boolean inputHandsAreInvalid = notCheckedGameHands.stream().anyMatch(not(handValidator::isValid));
//		if (inputHandsAreInvalid) {
//			throw new NullPointerException(); // TODO
//		}
		return notCheckedGameHands.stream()
			.map(Hand::new)
			.collect(Collectors.toList());
	}

	protected List<String> getNotCheckedHandsFromInputArgs(String... args) {
		return Stream.of(args).skip(1).collect(Collectors.toList());
	}

}
