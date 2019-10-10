package eu.ensup.master2.medecinpatient.domaine;

/**
 * @author benja Class métier Médecin
 */
public class Patient {

	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private Medecin medecin;

	public Patient() {
		super();
	}

	public Patient(int id, String nom, String prenom, String adresse, Medecin medecin) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.medecin = medecin;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public int getId() {
		return this.id;
	}

	public Medecin getMedecin() {
		return this.medecin;
	}

	public String getNom() {
		return this.nom;
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

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Patient [id=" + this.id + ", nom=" + this.nom + ", prenom=" + this.prenom + ", adresse=" + this.adresse
				+ ", medecin=" + this.medecin + "]";
	}
}
