package menjacnica;

import java.util.GregorianCalendar;

import interfejsimenjacnice.Postavljanjekursa;

public class Postavljanjekusra implements Postavljanjekursa {

	private Kurs[] kursevi = new Kurs[10];
	
	@Override
	public void dodavanjeKursaValuteZaOdredjeniDan(double prodajniKurs,
			double srednjiKurs, double kupovniKurs, String nazivValute,
			String skraceniNazivValute, GregorianCalendar datum) {
		
		kursevi[1].setKupovniKurs(kupovniKurs);
		kursevi[1].setProdajniKurs(prodajniKurs);
		kursevi[1].setSrednjiKurs(srednjiKurs);
		
	}

	@Override
	public void brisanjeKursaValuteZaOdredjeniDan(GregorianCalendar datum) {
		kursevi[1].setKupovniKurs(0);

	}

	@Override
	public Kurs pronalazenjeKursaZaOdredjeniDan(GregorianCalendar datum) {
		
		for (int i = 0; i < kursevi.length; i++) {
			kursevi[i].getKupovniKurs();
		}
		
		return null;
	}

}
