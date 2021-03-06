package model;

public class Gebruiker {
	
	//variabele declaratie van gebruiker
	private int id;
	private int idAfdeling;
	private int idRol;
	private String voorNaam;
	private String tussenvoegsel;
	private String achterNaam;
	private String email;
	private String wachtwoord;
	private double salaris;
	private int actief;
	
	// informatie uit andere DB tabellen
	private String organisatie;
	private String afdeling;
	private String rol;
	
	// Constructor die word gebruikt voor de Gebruikers overzicht
	public Gebruiker(int id, String voorNaam, String tussenvoegsel, String achterNaam, String email, String organisatie,
			String rol) {
		this.id = id;
		this.voorNaam = voorNaam;
		this.tussenvoegsel = tussenvoegsel;
		this.achterNaam = achterNaam;
		this.email = email;
		this.organisatie = organisatie;
		this.rol = rol;
	}

	// deze constructor word gebruikt wanneer een gebruiker al een id heeft
	public Gebruiker(int id, int idAfdeling, int idRol, String voorNaam, String tussenvoegsel, String achterNaam,
			String email, double salaris, int actief) {
		this.id = id;
		this.idAfdeling = idAfdeling;
		this.idRol = idRol;
		this.voorNaam = voorNaam;
		this.tussenvoegsel = tussenvoegsel;
		this.achterNaam = achterNaam;
		this.email = email;
		this.salaris = salaris;
		this.actief = actief;
	}
	
	// deze constructor word gebruikt wanneer een gebruiker nog geen id heeft
	// bijvoorbeeld bij het aanmaken van een nieuwe gebruiker
	public Gebruiker(int idAfdeling, int idRol, String voorNaam, String tussenvoegsel, String achterNaam, String email,
			String wachtwoord, double salaris, int actief) {
		this.idAfdeling = idAfdeling;
		this.idRol = idRol;
		this.voorNaam = voorNaam;
		this.tussenvoegsel = tussenvoegsel;
		this.achterNaam = achterNaam;
		this.email = email;
		this.wachtwoord = wachtwoord;
		this.salaris = salaris;
		this.actief = actief;
	}	

	public int getId() {
		return id;
	}	

	public void setId(int id) {
		this.id = id;
	}

	public int getIdAfdeling() {
		return idAfdeling;
	}

	public void setIdAfdeling(int idAfdeling) {
		this.idAfdeling = idAfdeling;
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getVoorNaam() {
		return voorNaam;
	}

	public void setVoorNaam(String voorNaam) {
		this.voorNaam = voorNaam;
	}

	public String getTussenvoegsel() {
		return tussenvoegsel;
	}

	public void setTussenvoegsel(String tussenvoegsel) {
		this.tussenvoegsel = tussenvoegsel;
	}

	public String getAchterNaam() {
		return achterNaam;
	}

	public void setAchterNaam(String achterNaam) {
		this.achterNaam = achterNaam;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWachtwoord() {
		return wachtwoord;
	}

	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}

	public double getSalaris() {
		return salaris;
	}

	public void setSalaris(double salaris) {
		this.salaris = salaris;
	}

	public int getActief() {
		return actief;
	}

	public void setActief(int actief) {
		this.actief = actief;
	}
	
	public String getOrganisatie() {
		return organisatie;
	}

	public void setOrganisatie(String organisatie) {
		this.organisatie = organisatie;
	}

	public String getAfdeling() {
		return afdeling;
	}

	public void setAfdeling(String afdeling) {
		this.afdeling = afdeling;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	// deze methode print alle gegevens uit van de gebruiker
	@Override
	public String toString() {
		return "Gebruiker [id=" + id + ", idAfdeling=" + idAfdeling + ", idRol=" + idRol + ", voorNaam=" + voorNaam
				+ ", tussenvoegsel=" + tussenvoegsel + ", achterNaam=" + achterNaam + ", email=" + email + ", salaris="
				+ salaris + ", actief=" + actief + "]";
	}
	
	

}
