package eu.ensup.master2.medecinpatient.presentation;

import eu.ensup.master2.medecinpatient.domaine.Medecin;
import eu.ensup.master2.medecinpatient.domaine.Patient;
import eu.ensup.master2.medecinpatient.service.MedecinService;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Medecin m1 = new Medecin();
		Patient p1 = new Patient();
		m1.setNom("Michel");
		p1.setNom("Jean");
		MedecinService service = new MedecinService();
		service.consulter(m1, p1);
	}

}
