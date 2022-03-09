package Controller;

import java.util.LinkedList;
import java.util.List;

import Artikli.BaseProizvod;
import Interfejs.IOperacije;

public class ProizvodController implements IOperacije{

	List<BaseProizvod> proizvodi;

	public ProizvodController() {
		proizvodi=new LinkedList<BaseProizvod>();
	}
	@Override
	public void AddProizvod(BaseProizvod proizvod) {

		BaseProizvod nadjen=FindProizvode(proizvod.getSifra());
		if(nadjen!=null) {
				nadjen.setKolicina(nadjen.getKolicina()+proizvod.getKolicina());
			
			
		}else {
			proizvodi.add(proizvod);
			}
	}

	@Override
	public void RemoveProizvod(BaseProizvod proizvod) {

		BaseProizvod nadjen=FindProizvode(proizvod.getSifra());
		if(nadjen!=null) {
			if((nadjen.getKolicina()-proizvod.getKolicina())>0) {
				nadjen.setKolicina(nadjen.getKolicina()-proizvod.getKolicina());
			}
			else {
				nadjen.setKolicina(0);
			}
		}else {
			proizvodi.add(proizvod);
			}

	}

	@Override

	public BaseProizvod FindProizvode(long sifra) {


		for (BaseProizvod baseProizvod : proizvodi) {
			if(baseProizvod.getSifra()==sifra) return baseProizvod;
		}
		return null;
	}

}
