package com.supinfo.java.td;

public class Groupe {
	private int id;
	private String nom;
	private String date_creation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(String date_creation) {
		this.date_creation = date_creation;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Groupe [id=" + id + ", nom=" + nom + ", date_creation=" + date_creation + "]";
	}
	
	
	public static void main(String[]arg) {
		
		Groupe group1 = new Groupe();
		Groupe group2 = new Groupe();
		
		group1.setId(1);
		group1.setNom("PR 311");
		group1.setDate_creation("2021-2022");
		
		

		group2.setId(2);
		group2.setNom("PR 215");
		group2.setDate_creation("2020-2021");
		
		
		System.out.println(group1);
		System.out.println(group2);
		
	

}
}
