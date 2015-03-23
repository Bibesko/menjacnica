package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejsimenjacnice.Postavljanjekursa;

public class Postavljanjekusra implements Postavljanjekursa {


	private LinkedList <Kurs> kursevi = new LinkedList<Kurs>(); 

	public void dodavanjeKursaValuteZaOdredjeniDan(double prodajniKurs,
			double srednjiKurs, double kupovniKurs, String nazivValute,
			String skraceniNazivValute, GregorianCalendar datum) {
		

		Kurs k = new Kurs();
		
		k.setProdajniKurs(prodajniKurs);
		k.setNazivValute(nazivValute);
		k.setSkraceniNazivValute(skraceniNazivValute);
		k.setSrednjiKurs(srednjiKurs);
		k.setKupovniKurs(kupovniKurs);
		k.setG(datum);
		
		kursevi.add(k);

	}

	@Override
	public void brisanjeKursaValuteZaOdredjeniDan(GregorianCalendar datum) {

		
		for (int i = 0; i < kursevi.size();i++) {
			if ( kursevi.get(i).getG() == datum) {
				kursevi.remove(i);
			}
		}
		
		

	}

	@Override
	public Kurs pronalazenjeKursaZaOdredjeniDan(GregorianCalendar datum) {
		

		for (int i = 0; i < kursevi.size();i++) {
			if ( kursevi.get(i).getG() == datum) {
				return kursevi.get(i);
			}

		}
		
		return null;
		
	}

}
