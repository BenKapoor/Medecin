package eu.ensup.master2.medecinpatientv3.service;

import java.util.ArrayList;

import eu.ensup.master2.medecinpatientv3.dao.MedecinDao;
import eu.ensup.master2.medecinpatientv3.domaine.Medecin;
import eu.ensup.master2.medecinpatientv3.domaine.Patient;

/**
 * @author benja Méthode consulter ayant en paramètre Medecin et Patient
 */
public class MedecinService {
	MedecinDao dao = new MedecinDao();

	public void consulter(Medecin m1, Patient p1) {
		System.out.println("Le patient " + p1.getNom() + " est malade, il sera soigné par " + m1.getNom());
	}

	public void creerMedecin(Medecin m1) {
		this.dao.creerMedecin(m1);
	}

	public ArrayList<Medecin> lireMedecin(Medecin m1, int id) {
		ArrayList<Medecin> ArrayUnMedecin = new ArrayList<>();
		ArrayUnMedecin = this.dao.lireMedecin(m1, id);

		return ArrayUnMedecin;
	}
}
