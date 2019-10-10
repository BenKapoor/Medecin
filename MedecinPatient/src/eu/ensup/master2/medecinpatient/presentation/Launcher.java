package eu.ensup.master2.medecinpatient.presentation;

import eu.ensup.master2.medecinpatient.domaine.Medecin;
import eu.ensup.master2.medecinpatient.domaine.Patient;
<<<<<<< HEAD
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
=======

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Medecin m1 = new Medecin();
		Patient p1 = new Patient();
		m1.setNom("Michel");
		p1.setNom("Jean");
		System.out.println("Le patient " + p1.getNom() + " est malade, il sera soigné par " + m1.getNom());
>>>>>>> branch 'master' of https://github.com/BenKapoor/Medecin
	}

}
