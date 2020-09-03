package lv.ks.tehasholdem.game.validator;

import lv.ks.tehasholdem.game.common.GameRegex;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

import static lv.ks.tehasholdem.game.common.GameRegex.HAND_PATTERN;

@Service
public class HandValidator {

	public boolean isValid(String cardSequence) {
		return HAND_PATTERN.matcher(cardSequence).matches();
	}

}
