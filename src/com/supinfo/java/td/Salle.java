package com.supinfo.java.td;

public class Salle {
	private int id_salle;
	private String nom_salle;
	private String localisation;
	private String capacite;
	public int getId_salle() {
		return id_salle;
	}
	public void setId_salle(int id_salle) {
		this.id_salle = id_salle;
	}
	public String getNom_salle() {
		return nom_salle;
	}
	public void setNom_salle(String nom_salle) {
		this.nom_salle = nom_salle;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public String getCapacite() {
		return capacite;
	}
	public void setCapacite(String capacite) {
		this.capacite = capacite;
	}
	
	

	@Override
	public String toString() {
		return "Salle [id_salle=" + id_salle + ", nom_salle=" + nom_salle + ", localisation=" + localisation
				+ ", capacite=" + capacite + "]";
	}
	public static void main(String[]arg) {
		
		Salle sall1 = new Salle();
		Salle sall2 = new Salle();
		
		sall1.setId_salle(1);
		sall1.setNom_salle("WIFI");
		sall1.setLocalisation("en bas");
		sall1.setCapacite("30 personnes");
		
		sall2.setId_salle(3);
		sall2.setNom_salle("network");
		sall2.setLocalisation("en haut");
		sall2.setCapacite("20 personnes");
		
		
		System.out.println(sall1);
		System.out.println(sall2);
		
		
		
		
}
}
