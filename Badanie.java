import javax.xml.crypto.Data;

public abstract class Badanie {

	private Data data;
	private Pacjent pacjent;
	private float wynik;
	private String nazwa;
	private float dolnaGranica;
	private int gornaGranica;
	private Lekarz lekarz;

	public float getWynik() {
		return this.wynik;
	}

	public boolean wynikWNormie() {
		// TODO - implement Badanie.wynikWNormie
		throw new UnsupportedOperationException();
	}

	public float getGranicaDolna() {
		// TODO - implement Badanie.getGranicaDolna
		throw new UnsupportedOperationException();
	}

	public float getGranicaGorna() {
		// TODO - implement Badanie.getGranicaGorna
		throw new UnsupportedOperationException();
	}

}