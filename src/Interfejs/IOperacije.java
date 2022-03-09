package Interfejs;

import java.util.List;

import Artikli.BaseProizvod;

public interface IOperacije {

	void AddProizvod(BaseProizvod proizvod);
	void RemoveProizvod(BaseProizvod proizvod);
	
	BaseProizvod FindProizvode(long sifra);
}
