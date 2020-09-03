package lv.ks.tehasholdem.app.io.service;

import lv.ks.tehasholdem.game.entity.Board;
import lv.ks.tehasholdem.game.validator.BoardValidator;
import lv.ks.tehasholdem.game.validator.HandValidator;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CommandLineInputArgumentParserTest {

	private static final String VALID_INPUT_BOARD = "4cKs4h8s7s";

	private static final String[] VALID_INPUT_HANDS = {"Ad4s", "Ac4d", "As9s", "KhKd", "5d6d"};

	private final static String[] VALID_INPUT_PARAMS = getValidInputParams();

	@Spy
	private BoardValidator boardValidator;

	@Spy
	private HandValidator handValidator;

	private CommandLineInputArgumentParser parser;

	@BeforeEach
	private void setUp() {
		parser = new CommandLineInputArgumentParser(boardValidator, handValidator);
	}

	@Test
	public void getNotCheckedGameBoardFromInputArgs_shouldReturnNotCheckedBoard() {
		String notCheckedGameBoard = parser.getNotCheckedBoardFromInputArgs(VALID_INPUT_PARAMS);

		assertThat(notCheckedGameBoard, is(VALID_INPUT_BOARD));
	}

	@Test
	public void getNotCheckedGameHandsFromInputArgs_shouldReturnNotCheckedHands() {
		List<String> notCheckedGameBoard = parser.getNotCheckedHandsFromInputArgs(VALID_INPUT_PARAMS);

		assertEquals(notCheckedGameBoard, List.of(VALID_INPUT_HANDS));
	}

	@Test
	public void getGameBoard_shouldThrowException_whenBoardIsNull() {
		assertThrows(NullPointerException.class, () -> parser.getGameBoard(null));
	}

	@Test
	public void getGameBoard_shouldThrowException_whenBoardIsNotValid() {
		assertThrows(NullPointerException.class, () -> parser.getGameBoard("NotValidBoard"));
	}

	@Test
	public void getGameBoard_shouldReturnBoardInstance_whenBoardIsValid() {
		assertThat(parser.getGameBoard(VALID_INPUT_BOARD), instanceOf(Board.class));
	}

	private static String[] getValidInputParams() {
		return ArrayUtils.addAll(new String[] {VALID_INPUT_BOARD}, VALID_INPUT_HANDS);
	}

}