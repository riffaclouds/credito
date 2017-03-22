package model;

public class Rol {
	
	//variabele declaratie van rol
	private int id;
	private String rol;
	private String omschrijving;
	
	public Rol(int id, String rol, String omschrijving) {
		this.id = id;
		this.rol = rol;
		this.omschrijving = omschrijving;
	}
	public Rol(String rol, String omschrijving) {
		this.rol = rol;
		this.omschrijving = omschrijving;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getOmschrijving() {
		return omschrijving;
	}
	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}
	
	@Override
	public String toString() {
		return "Rol [id=" + id + ", rol=" + rol + ", omschrijving=" + omschrijving + "]";
	}
	

}
