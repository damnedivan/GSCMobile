package arm.developer.gsportmobile.adapter;

public enum AdapterJam {
	tujuh("07:00", "Pukul 07:00"), delapan("08:00", "Pukul 08:00"), sembilan(
			"09:00", "Pukul 09:00"), sepuluh("10:00", "Pukul 10:00"), sebelas(
			"11:00", "Pukul 11:00"), duabelas("12:00", "Pukul 12:00"), tigabelas(
			"13:00", "Pukul 13:00"), empatbelas("14:00", "Pukul 14:00"), limabelas(
			"15:00", "Pukul 15:00"), enambelas("16:00", "Pukul 16:00"), tujuhbelas(
			"17:00", "Pukul 17:00"), delapanbelas("18:00", "Pukul 18:00"), sembilanbelas(
			"19:00", "Pukul 19:00"), duapuluh("20:00", "Pukul 20:00"), duasatu(
			"21:00", "Pukul 21:00"), duadua("22:00", "Pukul 22:00"), duatiga(
			"23:00", "Pukul 23:00");

	private String text;
	private String value;

	AdapterJam(String text, String value) {
		this.text = text;
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public String toString() {
		return text;
	}

}
