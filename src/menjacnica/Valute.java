package menjacnica;

public class Valute {
	
	private String nazivValute;
	private String skraceniNazivValute;
	
	
	public String getNazivValute() {
		return nazivValute;
	}
	public void setNazivValute(String nazivValute) {
		this.nazivValute = nazivValute;
	}
	public String getSkraceniNazivValute() {
		return skraceniNazivValute;
	}
	public void setSkraceniNazivValute(String skraceniNazivValute) {
		this.skraceniNazivValute = skraceniNazivValute;
	}
	
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nazivValute == null) ? 0 : nazivValute.hashCode());
		result = prime
				* result
				+ ((skraceniNazivValute == null) ? 0 : skraceniNazivValute
						.hashCode());
		return result;
	}
	

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valute other = (Valute) obj;
		if (nazivValute == null) {
			if (other.nazivValute != null)
				return false;
		} else if (!nazivValute.equals(other.nazivValute))
			return false;
		if (skraceniNazivValute == null) {
			if (other.skraceniNazivValute != null)
				return false;
		} else if (!skraceniNazivValute.equals(other.skraceniNazivValute))
			return false;
		return true;
	}
	

	public String toString() {
		return "Valute [nazivValute=" + nazivValute + ", skraceniNazivValute="
				+ skraceniNazivValute + "]";
	}
			
}
