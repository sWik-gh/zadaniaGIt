class KontoBankowe {
	private double saldo;

	KontoBankowe(double saldo) {
		this.saldo = saldo;
	}

	void wplac(double kwota) {
		saldo += kwota;
	}
	void wyplac(double kwota) {
		if (saldo < kwota) {
			System.out.println("Za male saldo");
		} else {
			saldo -= kwota;
		}
	}
	double getSaldo() {
		return this.saldo;	
	}
}
