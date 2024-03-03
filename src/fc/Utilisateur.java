package fc;
/**
 * Classe Utilisateur
 *
 * Cette classe permet de créer un objet Utilisateur
 *
 * Un utilisateur est caractérisé par :
 * - son nom
 * - son prénom
 * - son statut de personnel médical
 *
 * Cette classe contient les méthodes pour récupérer les attributs de l'objet
 *
 * @version 1.0
 * @since 2020-03-12
 */
public class Utilisateur {
    private String nom;
    private String prenom;
    private boolean personnelMedical;
    private String langue;

    private int idService;

    private int idUtilisateur;

    // Constructeur pour initialiser tous les attributs
    public Utilisateur(String nom, String prenom, boolean personnelMedical, String langue, int idService, int idUtilisateur) {
        this.nom = nom;
        this.prenom = prenom;
        this.personnelMedical = personnelMedical;
        this.langue = langue;
        this.idService = idService;
        this.idUtilisateur = idUtilisateur;
    }

    // Getters
    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public boolean isPersonnelMedical() {
        return this.personnelMedical;
    }

    public String getLangue() {
        return this.langue;
    }

    public int getIdService() {
        return this.idService;
    }

    public String getIdUtilisateur() {
        return Integer.toString(this.idUtilisateur);
    }
}
