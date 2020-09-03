package lv.ks.tehasholdem.game.validator;

import org.springframework.stereotype.Service;

import static lv.ks.tehasholdem.game.common.GameRegex.BOARD_PATTERN;

@Service
public class BoardValidator implements CardSequenceValidator {

	public boolean check(String cardSequence) {
		return BOARD_PATTERN.matcher(cardSequence).matches();
	}

}
