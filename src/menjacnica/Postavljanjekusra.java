package menjacnica;

import java.util.GregorianCalendar;

import interfejsimenjacnice.Postavljanjekursa;

public class Postavljanjekusra implements Postavljanjekursa {

	@Override
	public void dodavanjeKursaValuteZaOdredjeniDan(double prodajniKurs,
			double srednjiKurs, double kupovniKurs, String nazivValute,
			String skraceniNazivValute, GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public void brisanjeKursaValuteZaOdredjeniDan(GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs pronalazenjeKursaZaOdredjeniDan(GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
