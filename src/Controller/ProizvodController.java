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
		
		proizvodi.add(proizvod);
	}

	@Override
	public void RemoveProizvod(BaseProizvod proizvod) {
		proizvodi.remove(proizvod);
		
	}

	@Override
	public BaseProizvod FindProizvode(int sifra) {
		
		for (BaseProizvod baseProizvod : proizvodi) {
			if(baseProizvod.getSifra()==sifra) return baseProizvod;
		}
		return null;
	}

}
