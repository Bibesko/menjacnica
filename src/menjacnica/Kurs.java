package menjacnica;

public class Kurs extends Valute {

	private double prodajniKurs;
	private double srednjiKurs;
	private double kupovniKurs;
	
	
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if ( prodajniKurs > 0 ) {
			this.prodajniKurs = prodajniKurs;
		}
		else {
			throw new RuntimeException("Morate uneti kurs koji je veci od 0.");
		}
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		if ( srednjiKurs > 0 ) {
			this.srednjiKurs = srednjiKurs;
		}
		else {
			throw new RuntimeException("Morate uneti kurs koji je veci od 0.");
		}
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if ( kupovniKurs > 0 ) {
			this.kupovniKurs = kupovniKurs;
		}
		else {
			throw new RuntimeException("Morate uneti kurs koji je veci od 0.");
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kurs other = (Kurs) obj;
		if (Double.doubleToLongBits(kupovniKurs) != Double
				.doubleToLongBits(other.kupovniKurs))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double
				.doubleToLongBits(other.prodajniKurs))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double
				.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}
	

	public String toString() {
		return "Kurs [prodajniKurs=" + prodajniKurs + ", srednjiKurs="
				+ srednjiKurs + ", kupovniKurs=" + kupovniKurs + "]";
	}
		
}
