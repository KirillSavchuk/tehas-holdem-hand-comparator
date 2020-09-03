package lv.ks.tehasholdem.game.parser;

import lv.ks.tehasholdem.game.enums.CardRank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CardRankParserTest {

	private CardRankParser cardRankParser;

	@BeforeEach
	void setUp() {
		this.cardRankParser = new CardRankParser();
	}

	@ParameterizedTest
	@MethodSource("getInvalidCardRankExpectedValues")
	void parseCardRank_shouldThrowException_whenCardRankNotFound(Character inputCardRank) {
		assertThrows(NullPointerException.class, () -> cardRankParser.parseCardRank(inputCardRank));
	}

	@ParameterizedTest
	@MethodSource("getValidCardRankExpectedValues")
	void parseCardRank_shouldReturnCorrectEnum_whenCardRankIsFound(Character inputCardRank, CardRank expectedCardRank) {
		assertThat(cardRankParser.parseCardRank(inputCardRank), is(expectedCardRank));
	}

	private static Stream<Character> getInvalidCardRankExpectedValues() {
		return Stream.of(' ', '0', '1', 'X', '#');
	}


	private static Stream<Arguments> getValidCardRankExpectedValues() {
		return Stream.of(
			Arguments.of('A', CardRank.ACE),
			Arguments.of('K', CardRank.KING),
			Arguments.of('Q', CardRank.QUEEN),
			Arguments.of('J', CardRank.JACK),
			Arguments.of('T', CardRank.TEN),
			Arguments.of('9', CardRank.NINE),
			Arguments.of('8', CardRank.EIGHT),
			Arguments.of('7', CardRank.SEVEN),
			Arguments.of('6', CardRank.SEVEN),
			Arguments.of('5', CardRank.FIVE),
			Arguments.of('4', CardRank.FOUR),
			Arguments.of('3', CardRank.THREE),
			Arguments.of('2', CardRank.TWO)
		);
	}

}