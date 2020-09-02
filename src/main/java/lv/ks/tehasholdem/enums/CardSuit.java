package lv.ks.tehasholdem.enums;

import lombok.Getter;

@Getter
public enum CardSuit {

	H('h'),
	D('D'),
	C('C'),
	S('S');

	private char suit;

	CardSuit(char c) {
	}

}
