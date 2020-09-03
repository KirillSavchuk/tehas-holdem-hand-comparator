package lv.ks.tehasholdem.app.core;

import lv.ks.tehasholdem.app.core.entity.GameInput;
import lv.ks.tehasholdem.app.core.entity.GameOutput;
import org.springframework.stereotype.Service;

@Service
public interface GameProcessor {

	GameOutput process(GameInput gameInput);

}
