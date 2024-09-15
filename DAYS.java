
public enum DAYS {
	
	FIRST(1, "first"), SECOND(2, "second"), THIRD(3, "third"), FOURTH(4, "fourth"), FIFTH(5, "fifth"), SIXTH(6, "sixth"), SEVENTH(7, "seventh"), EIGHTH(8, "eighth"), NINETH(9, "ninth"), TENTH(10, "tenth"), ELEVENTH(11, "eleventh"), TWELVETH(12, "twelveth");

	private int numeric;
	private String name;

	DAYS(int numeric, String name) {
		// TODO Auto-generated constructor stub
		this.numeric = numeric;
			this.name = name;
	}
		

	
	public static int getVal(int i) {
		return DAYS.values()[i].numeric;
	}
	
	public static String getName(int i) {
		return DAYS.values()[i].name;
	}

}
