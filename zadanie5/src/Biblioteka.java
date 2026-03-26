class Biblioteka {
	ArrayList<Ksiazka> ksiazki;

	void dodajKsiazke(Ksiazka k) {
		ksiazki.add(k);
	}
	void wyswietlWszystkie() {
		System.out.println(ksiazki.toString());
	}
}
