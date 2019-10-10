package eu.ensup.master2.medecinpatient.domaine;

/**
<<<<<<< HEAD
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

=======
 * @author benja Class metier de Patient associé à celle de Medecin
 */
public class Medecin {

	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private Patient patient;

	public Medecin() {
		super();
	}

	public Medecin(int id, String nom, String prenom, String adresse, Patient patient) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.patient = patient;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public int getId() {
		return this.id;
	}

	public String getNom() {
		return this.nom;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Medecin [id=" + this.id + ", nom=" + this.nom + ", prenom=" + this.prenom + ", adresse=" + this.adresse
				+ ", patient=" + this.patient + "]";
	}
>>>>>>> branch 'master' of https://github.com/BenKapoor/Medecin
}
