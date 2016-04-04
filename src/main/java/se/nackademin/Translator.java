package se.nackademin;

class Translator {

	private static final String[] ADJECTIVES = {"stor", "liten", "stark", "svag", "mjuk", "hård", "snabb", "vacker", "ljus", "mörk"};
	private static final String[] NOUNS = {"en lönehöjning", "en lönesänkning", "en fotboja", "en katt", "en hund", " ett hus", "ett barn", "ett elstängsel", "en dator", "ett golv"};
	private static final String[] VERBS = {"springa", "ljuga", "flyga", "se", "vara", "äta", "mäta", "gå", "röra", "resa"};

	public Translator() {
	}

	public String getAdjective(int magicNumber) {
		return ADJECTIVES[magicNumber];
	}

	public String getNoun(int magicNumber) {
		return NOUNS[magicNumber];
	}

	public String getVerb(int magicNumber) {
		return VERBS[magicNumber];
	}
}
