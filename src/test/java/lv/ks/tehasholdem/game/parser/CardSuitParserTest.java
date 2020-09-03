package lv.ks.tehasholdem.game.parser;

import lv.ks.tehasholdem.game.enums.CardSuit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CardSuitParserTest {

	private CardSuitParser cardSuitParser;

	@BeforeEach
	void setUp() {
		this.cardSuitParser = new CardSuitParser();
	}

	@ParameterizedTest
	@MethodSource("getInvalidCardSuitValues")
	public void parseCardSuit_shouldThrowException_whenCardSuitIsNotFound(Character inputCardSuit) {
		assertThrows(NullPointerException.class, () -> cardSuitParser.parseCardSuit(inputCardSuit));
	}

	@ParameterizedTest
	@MethodSource("getValidCardSuitValues")
	public void parseCardSuit_shouldReturnCorrectEnum_whenCardSuitIsFound(Character inputCardSuit, CardSuit expectedCardSuit) {
		assertThat(cardSuitParser.parseCardSuit(inputCardSuit), is(expectedCardSuit));
	}

	private static Stream<Character> getInvalidCardSuitValues() {
		return Stream.of(' ', '0', '1', 'X', '#');
	}

	private static Stream<Arguments> getValidCardSuitValues() {
		return Stream.of(
			Arguments.of('h', CardSuit.HEARTS),
			Arguments.of('d', CardSuit.DIAMONDS),
			Arguments.of('c', CardSuit.CLUBS),
			Arguments.of('s', CardSuit.SPADES)
		);
	}


}