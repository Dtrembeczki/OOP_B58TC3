package homework;

public class book {
	private String title;
	private String author;
	private int yearOfPub;
	private int price;

	public void incPrice(int szazalek) { // adjunk meg neki egy szazalekos aranyt amennyitvel novelni szeretnenk a konyv
											// arat
		if (szazalek > 0) {
			price += Math.round(price * (float) szazalek / 100);
		}
	}// end of incPrice

	public String dispInfo() {
		return author + ": " + title + ", " + yearOfPub + ". Ara: "+ price + "Ft"; 
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYearOfPub() {
		return yearOfPub;
	}

	public void setYearOfPub(int yearOfPub) {
		if (yearOfPub >= 1950 && yearOfPub <= 2021) {
			this.yearOfPub = yearOfPub;
		} else {
			this.yearOfPub = 2021;
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price >= 1000) {
			this.price = price;
		} else {
			this.price = 1000;
		}
	}

}
