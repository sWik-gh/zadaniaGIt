class Samochod {
	String marka;
	String model;
	int rokProd;

	Samochod(String marka. String model. int rokProd) {
		this.marka = marka;
		this.model = model;
		this.rokProd = rokProd;
	}
	
	void wyswietlInfo() {
		System.out.println(marka + ", " + model + ", " + rokProd);
	}
}
