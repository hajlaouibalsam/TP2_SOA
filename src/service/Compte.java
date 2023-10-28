package service;

public class Compte {
    private int code;
    private double solde;
    private String dateCreation;

    public Compte(int code, double d, String dateCreation) {
        this.code = code;
        this.solde = d;
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }
    public String toString()
	{
		return "le code est  "+code+" le solde est  "+solde+" la date de creation est "+dateCreation;
		
	}
}