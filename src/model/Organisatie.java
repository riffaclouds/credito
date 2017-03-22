package model;

public class Organisatie {
	
	//variabele declaratie van organisatie
	private int id;
	private String naam;
	private String domein;
	private int actief;
	
	// constructors
	public Organisatie(int id, String naam, String domein, int actief) {
		this.id = id;
		this.naam = naam;
		this.domein = domein;
		this.actief = actief;
	}
	
	// constructor zonder id parameter
	public Organisatie(String naam, String domein, int actief) {
		this.naam = naam;
		this.domein = domein;
		this.actief = actief;
	}

	// getters en setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getDomein() {
		return domein;
	}

	public void setDomein(String domein) {
		this.domein = domein;
	}

	public int getActief() {
		return actief;
	}

	public void setActief(int actief) {
		this.actief = actief;
	}

	@Override
	public String toString() {
		return "Organisatie [id=" + id + ", naam=" + naam + ", domein=" + domein + ", actief=" + actief + "]";
	}
	
	

}
