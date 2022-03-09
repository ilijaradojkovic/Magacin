package Artikli;

public class BaseProizvod {

	private String naziv;
	private long sifra;
	private String opis;
	private int kolicina;
	
	public BaseProizvod(String naziv, long sifra, String opis, int kolicina) {
		super();
		this.naziv = naziv;
		this.sifra = sifra;
		this.opis = opis;
		this.kolicina = kolicina;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public long getSifra() {
		return sifra;
	}
	public void setSifra(long sifra) {
		this.sifra = sifra;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	
}
