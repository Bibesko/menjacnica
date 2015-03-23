package interfejsimenjacnice;
import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface Postavljanjekursa {

	public void dodavanjeKursaValuteZaOdredjeniDan (double prodajniKurs, double srednjiKurs, 
			double kupovniKurs, String nazivValute, String skraceniNazivValute, GregorianCalendar datum);
	
	public void brisanjeKursaValuteZaOdredjeniDan (GregorianCalendar datum);
	
	public Kurs pronalazenjeKursaZaOdredjeniDan (GregorianCalendar datum);
	
}
