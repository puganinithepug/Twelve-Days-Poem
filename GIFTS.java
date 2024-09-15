
public enum GIFTS {
	
			ONE("a partridge in a pear tree"), TWO("two turtle doves"),
			THREE("three French Hens"),
			FOUR("four Calling Birds"),
			FIVE("five Golden Rings"),
			SIX("six Geese a Laying"),
			SEVEN("seven Swans a Swimming"),
			EIGHT("eight Maids a Milking"),
			NINE("nine Ladies Dancing"),
			TEN("ten Lords a Leaping"),
			ELEVEN("eleven Pipers Piping"),
			TWELVE("twelve Drummers Drumming");
	
	private String gift;

	GIFTS(String gift) {
		this.gift =gift;
		}
public static String getGift(int i){
	return GIFTS.values()[i].gift;
	
}	

}


