package model;

public class Rekening {
	
	//variabele declaratie van rekening
	private int rekeningNummer;
	private int idAfdeling;
	private double saldo;
	private int actief;
	
	public Rekening(int rekeningNummer, int idAfdeling, double saldo, int actief) {
		this.rekeningNummer = rekeningNummer;
		this.idAfdeling = idAfdeling;
		this.saldo = saldo;
		this.actief = actief;
	}
	
	public Rekening(int idAfdeling, double saldo, int actief) {
		this.idAfdeling = idAfdeling;
		this.saldo = saldo;
		this.actief = actief;
	}
	public int getRekeningNummer() {
		return rekeningNummer;
	}
	public void setRekeningNummer(int rekeningNummer) {
		this.rekeningNummer = rekeningNummer;
	}
	public int getIdAfdeling() {
		return idAfdeling;
	}
	public void setIdAfdeling(int idAfdeling) {
		this.idAfdeling = idAfdeling;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getActief() {
		return actief;
	}
	public void setActief(int actief) {
		this.actief = actief;
	}
	
	@Override
	public String toString() {
		return "Rekening [rekeningNummer=" + rekeningNummer + ", idAfdeling=" + idAfdeling + ", saldo=" + saldo
				+ ", actief=" + actief + "]";
	}

}
