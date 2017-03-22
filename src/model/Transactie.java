package model;

public class Transactie {
	
	//variabele declaratie van transactie
	private int id;
	private int cardNummer;
	private int begunstigdeRekening;
	private String omschrijving;
	private double bedragDebet;
	private double bedragCredit;
	
	public Transactie(int id, int cardNummer, int begunstigdeRekening, String omschrijving, double bedragDebet,
			double bedragCredit) {
		this.id = id;
		this.cardNummer = cardNummer;
		this.begunstigdeRekening = begunstigdeRekening;
		this.omschrijving = omschrijving;
		this.bedragDebet = bedragDebet;
		this.bedragCredit = bedragCredit;
	}
	
	

	public Transactie(int cardNummer, int begunstigdeRekening, String omschrijving, double bedragDebet,
			double bedragCredit) {
		this.cardNummer = cardNummer;
		this.begunstigdeRekening = begunstigdeRekening;
		this.omschrijving = omschrijving;
		this.bedragDebet = bedragDebet;
		this.bedragCredit = bedragCredit;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCardNummer() {
		return cardNummer;
	}

	public void setCardNummer(int cardNummer) {
		this.cardNummer = cardNummer;
	}

	public int getBegunstigdeRekening() {
		return begunstigdeRekening;
	}

	public void setBegunstigdeRekening(int begunstigdeRekening) {
		this.begunstigdeRekening = begunstigdeRekening;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public double getBedragDebet() {
		return bedragDebet;
	}

	public void setBedragDebet(double bedragDebet) {
		this.bedragDebet = bedragDebet;
	}

	public double getBedragCredit() {
		return bedragCredit;
	}

	public void setBedragCredit(double bedragCredit) {
		this.bedragCredit = bedragCredit;
	}

	@Override
	public String toString() {
		return "Transactie [id=" + id + ", cardNummer=" + cardNummer + ", begunstigdeRekening=" + begunstigdeRekening
				+ ", omschrijving=" + omschrijving + ", bedragDebet=" + bedragDebet + ", bedragCredit=" + bedragCredit
				+ "]";
	}
	
	
	
}
