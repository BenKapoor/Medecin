package eu.ensup.master2.medecinpatientv3.dao;

import java.util.ArrayList;

import eu.ensup.master2.medecinpatientv3.domaine.Medecin;
import eu.ensup.master2.medecinpatientv3.domaine.Patient;

public interface IMedecinDao {

	public void consulter(Medecin m1, Patient p1);

	public void creerMedecin(Medecin m1);

	public ArrayList<Medecin> lireMedecin(Medecin m1, int id);
}
