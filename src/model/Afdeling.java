package model;

public class Afdeling {
	
	private int id;
	private int idOrganisatie;
	private String naam;
	private String omschrijving;
	private int actief;
	public Afdeling(int id, int idOrganisatie, String naam, String omschrijving, int actief) {
		this.id = id;
		this.idOrganisatie = idOrganisatie;
		this.naam = naam;
		this.omschrijving = omschrijving;
		this.actief = actief;
	}
	
	public Afdeling(int idOrganisatie, String naam, String omschrijving, int actief) {
		this.idOrganisatie = idOrganisatie;
		this.naam = naam;
		this.omschrijving = omschrijving;
		this.actief = actief;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdOrganisatie() {
		return idOrganisatie;
	}

	public void setIdOrganisatie(int idOrganisatie) {
		this.idOrganisatie = idOrganisatie;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public int getActief() {
		return actief;
	}

	public void setActief(int actief) {
		this.actief = actief;
	}

	@Override
	public String toString() {
		return "Afdeling [id=" + id + ", idOrganisatie=" + idOrganisatie + ", naam=" + naam + ", omschrijving="
				+ omschrijving + ", actief=" + actief + "]";
	}
	
	

}
