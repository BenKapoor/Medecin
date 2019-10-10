package eu.ensup.master2.medecinpatient.domaine;

/**
 * @author benja Class métier Médecin
 *
 *         Hérite la classe Personne
 */
public class Patient extends Personne {

	private String symptome;
	private Medecin medecin;

	/**
	 *
	 */
	public Patient() {
		super();
	}

	/**
	 * @param symptome
	 * @param medecin
	 */
	public Patient(String symptome, Medecin medecin) {
		super();
		this.symptome = symptome;
		this.medecin = medecin;
	}

	public Medecin getMedecin() {
		return this.medecin;
	}

	public String getSymptome() {
		return this.symptome;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	public void setSymptome(String symptome) {
		this.symptome = symptome;
	}

	@Override
	public String toString() {
		return "Patient [symptome=" + this.symptome + ", medecin=" + this.medecin + "]";
	}

}
