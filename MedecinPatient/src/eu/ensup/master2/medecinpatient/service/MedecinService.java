package eu.ensup.master2.medecinpatient.service;

import eu.ensup.master2.medecinpatient.domaine.Medecin;
import eu.ensup.master2.medecinpatient.domaine.Patient;

/**
 * @author benja Méthode consulter ayant en paramètre Medecin et Patient
 */
public class MedecinService {
	public void consulter(Medecin m1, Patient p1) {
		System.out.println("Le patient " + p1.getNom() + " est malade, il sera soigné par " + m1.getNom());
	}
}
