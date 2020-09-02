package lv.ks.tehasholdem.enums;

import lombok.Getter;

@Getter
public enum CardRank {

	A('A', 14),
	Q('Q', 13),
	K('K', 12),
	J('J', 11),
	N10('T', 10),
	N9('9', 9),
	N8('8', 8),
	N7('7', 7),
	N6('6', 6),
	N5('5', 5),
	N4('4', 4),
	N3('3', 3),
	N2('2', 2);

	private char title;
	private byte weight;

	CardRank(char title, int weight) {
	}

}

