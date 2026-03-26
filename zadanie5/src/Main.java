public static void main(String[] args) {
	Biblioteka b1 = new Biblioteka();

	Ksiazka k1 = new Ksiazka("t1", "a1");
	Ksiazka k2 = new Ksiazka("t2", "a2");
	Ksiazka k3 = new Ksiazka("t3", "a3");

	b1.dodajKsiazke(k1);
	b1.dodajKsiazke(k2);
	b1.dodajKsiazke(k3);
	b1.wyswietlWszystkie();
}
