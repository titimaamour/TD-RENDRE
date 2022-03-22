package com.supinfo.java.td;





public class Module {
	private int id;
	private String nom;
	private String description;
	private int volume_horaire;
	private int coefficient;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getVolume_horaire() {
		return volume_horaire;
	}
	public void setVolume_horaire(int volume_horaire) {
		this.volume_horaire = volume_horaire;
	}
	public int getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
	
	
@Override
	public String toString() {
		return "Module [id=" + id + ", nom=" + nom + ", description=" + description + ", volume_horaire="
				+ volume_horaire + ", coefficient=" + coefficient + "]";
	}
public static void main(String[]arg) {
		
		Module module1 = new Module();
		Module module2 = new Module();
		
		module1.setId(1);
		module1.setNom("JAVA");
		module1.setDescription("langage compilé");
		module1.setVolume_horaire(20);
		module1.setCoefficient(3);
		
		
		module2.setId(2);
		module2.setNom("python");
		module2.setDescription("langage de programmation");
		module2.setVolume_horaire(20);
		module2.setCoefficient(2);
		
		
		System.out.println(module1);
		System.out.println(module2);
		
		
		
}
}
