package arm.developer.gsportmobile.adapter;

public enum AdapterDurasi {
	satu("1 Jam", "1 Jam"),
	dua("2 Jam", "2 Jam"),
	tiga("3 Jam", "3 Jam"),
	empat("4 Jam", "4 Jam"),
	lima("5 Jam", "5 Jam");
	
	private String text;
	private String value;
	
	AdapterDurasi(String text, String value) {
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
