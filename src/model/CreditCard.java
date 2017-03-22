package model;

public class CreditCard {
	
	//variabele declaratie van CreditCard
	private int cardNummer;
	private int rekeningNummer;
	private int idGebruiker;
	private int actief;
	
	
	public CreditCard(int cardNummer, int rekeningNummer, int idGebruiker, int actief) {
		this.cardNummer = cardNummer;
		this.rekeningNummer = rekeningNummer;
		this.idGebruiker = idGebruiker;
		this.actief = actief;
	}


	public CreditCard(int rekeningNummer, int idGebruiker, int actief) {
		this.rekeningNummer = rekeningNummer;
		this.idGebruiker = idGebruiker;
		this.actief = actief;
	}


	public int getCardNummer() {
		return cardNummer;
	}


	public void setCardNummer(int cardNummer) {
		this.cardNummer = cardNummer;
	}


	public int getRekeningNummer() {
		return rekeningNummer;
	}


	public void setRekeningNummer(int rekeningNummer) {
		this.rekeningNummer = rekeningNummer;
	}


	public int getIdGebruiker() {
		return idGebruiker;
	}


	public void setIdGebruiker(int idGebruiker) {
		this.idGebruiker = idGebruiker;
	}


	public int getActief() {
		return actief;
	}


	public void setActief(int actief) {
		this.actief = actief;
	}


	@Override
	public String toString() {
		return "CreditCard [cardNummer=" + cardNummer + ", rekeningNummer=" + rekeningNummer + ", idGebruiker="
				+ idGebruiker + ", actief=" + actief + "]";
	}
	
	
	
}
