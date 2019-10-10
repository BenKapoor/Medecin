package eu.ensup.master2.medecinpatient.presentation;

import eu.ensup.master2.medecinpatient.domaine.Medecin;
import eu.ensup.master2.medecinpatient.domaine.Patient;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Medecin m1 = new Medecin();
		Patient p1 = new Patient();
		m1.setNom("Michel");
		p1.setNom("Jean");
		System.out.println("Le patient " + p1.getNom() + " est malade, il sera soigné par " + m1.getNom());
	}

}
