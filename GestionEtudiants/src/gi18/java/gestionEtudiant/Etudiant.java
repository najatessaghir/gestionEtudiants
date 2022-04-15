package gi18.java.gestionEtudiant;

import gestionDesEtudiants.Etudiant;

public class Etudiant {
	private int id ;
	private String nom;
	private double note;
	
	public Etudiant( int id, String nom) {
		this(id , nom , 10);
	}
	public Etudiant(int id ,String nom, double note){
		this.id=id;
		this.nom=nom;
		this.note=note;
		
	}
	 @Override
	public String toString() {
		return nom +":"+note;
	}
	 @Override
	public boolean equals(Object obj) {
		 if (!(obj instanceof Etudiant)) return false ;
		 return ((Etudiant)obj).id ==this.id ;
		 
	}

}
