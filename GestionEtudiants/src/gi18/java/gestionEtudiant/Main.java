package gi18.java.gestionEtudiant;

import gestionDesEtudiants.Etudiant;

public class Main {

	public static void main(String[] args) {
		Etudiant e1= new Etudiant(111 ,"mohamed", 20) ;
		Etudiant e2= new Etudiant(222 ,"kamal" , 15) ;
		Etudiant e3= new Etudiant(111 ,"mohamed");
		System.out.println(e1.equals(e3));
		System.out.println(e2.equals(e3));
		

	}

}
