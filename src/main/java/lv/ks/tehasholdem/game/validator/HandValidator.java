package lv.ks.tehasholdem.game.validator;

import lv.ks.tehasholdem.game.common.GameRegex;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class HandValidator {

	private final Pattern validPattern = Pattern.compile(GameRegex.HAND);

	public boolean isValid(String cardSequence) {
		return validPattern.matcher(cardSequence).matches();
	}

}
