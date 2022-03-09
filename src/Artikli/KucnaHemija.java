package Artikli;

import java.util.GregorianCalendar;

public class KucnaHemija extends BaseProizvod {

	public KucnaHemija(String naziv, long sifra, String opis, int kolicina) {
		
		super(naziv,sifra,opis,kolicina);
		// TODO Auto-generated constructor stub
	}
	private GregorianCalendar datumTrajanja;
	public GregorianCalendar getDatumTrajanja() {
		return datumTrajanja;
	}
	public void setDatumTrajanja(GregorianCalendar datumTrajanja) {
		this.datumTrajanja = datumTrajanja;
	}
	
 
}
