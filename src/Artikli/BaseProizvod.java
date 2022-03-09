package Artikli;

import java.util.Objects;

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
	public void setNaziv(String naziv) throws IllegalArgumentException {
		if(naziv==null) throw new IllegalArgumentException("Naziv ne sme biti null");
		if(naziv.length()==0) throw new IllegalArgumentException("Naziv ne sme biti prazan");
		this.naziv = naziv;
	}
	public long getSifra() {
		return sifra;
	}
	@Override
	public String toString() {
		return "BaseProizvod [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina=" + kolicina + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(kolicina, naziv, opis, sifra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseProizvod other = (BaseProizvod) obj;
		return kolicina == other.kolicina && Objects.equals(naziv, other.naziv) && Objects.equals(opis, other.opis)
				&& sifra == other.sifra;
	}
	public void setSifra(long sifra) throws IllegalAccessException {
		if(sifra<0) throw new IllegalAccessException("Sifra ne sme biti negativan broj");
		this.sifra = sifra;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) throws IllegalArgumentException {
		if(naziv==null) throw new IllegalArgumentException("Opis ne sme biti null");

		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) throws IllegalArgumentException {
		if(kolicina<0) throw new IllegalArgumentException("Kolicina ne sme biti  manja od 0");
		this.kolicina = kolicina;
	}
	
}
