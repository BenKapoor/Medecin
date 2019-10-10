package eu.ensup.master2.medecinpatient.domaine;

/**
 * @author benja
 *
 *         Class metier de Patient associé à celle de Medecin
 *
 *         Hérite de la classe Personne
 */
public class Medecin extends Personne {

	private Boolean disponibilite;
	private Patient patient;

	/**
	 *
	 */
	public Medecin() {
		super();
	}

	/**
	 * @param disponibilite
	 * @param patient
	 */
	public Medecin(Boolean disponibilite, Patient patient) {
		super();
		this.disponibilite = disponibilite;
		this.patient = patient;
	}

	public Boolean getDisponibilite() {
		return this.disponibilite;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setDisponibilite(Boolean disponibilite) {
		this.disponibilite = disponibilite;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Medecin [disponibilite=" + this.disponibilite + ", patient=" + this.patient + "]";
	}
}
