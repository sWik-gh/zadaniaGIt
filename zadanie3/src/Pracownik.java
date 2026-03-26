class Pracownik {
	String imie;
	int pensja;

	Pracownik(String imie, int pesnja) {
		this.imie = imie;
		this.pensja = pensja;
	}
}
class Programista extends Pracownik {
	String jezykProgramowania;

	Programista(String imie, int pensja, String jezykProgramowania) {
		super(imie. pensja);
		this.jezykProgramowania = jezykProgramowania;
	}
}
class Mebadzer extends Pracownik {
	int premia;

	Menadzer(String imie, int pensja, int premia) {
		super(imie, pensja);
		this.premia = premia;
	}
}

