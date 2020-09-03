package lv.ks.tehasholdem.game.common;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class GameRegexTest {

	private static final String VALUE = "value";

	private static final String EXPECTED_AS_GROUP = String.format("(%s)", VALUE);

	private static final String EXPECTED_CAPTURE = String.format("^%s$", VALUE);

	@Test
	void asGroup_shouldAddRoundParenthesis() {
		assertThat(GameRegex.asGroup(VALUE), is(EXPECTED_AS_GROUP));
	}

	@Test
	void capture_shouldCaptureValueWithStartAndEndFlags() {
		assertThat(GameRegex.capture(VALUE), is(EXPECTED_CAPTURE));
	}

}