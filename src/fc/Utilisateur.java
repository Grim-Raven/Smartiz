package fc;
/**
 * Classe Utilisateur
 * Cette classe permet de créer un objet Utilisateur
 * Un utilisateur est caractérisé par :
 * - son nom
 * - son prénom
 * - son statut de personnel médical
 * Cette classe contient les méthodes pour récupérer les attributs de l'objet
 *
 * @version 1.0
 * @since 2020-03-12
 */
public class Utilisateur {
    private final String nom;
    private final String prenom;
    private final boolean personnelMedical;
    private final String langue;

    private final int idService;

    private final int idUtilisateur;

    private final boolean arc;

    // Constructeur pour initialiser tous les attributs
    public Utilisateur(String nom, String prenom, boolean personnelMedical, String langue, int idService, int idUtilisateur, String arc) {
        this.nom = nom;
        this.prenom = prenom;
        this.personnelMedical = personnelMedical;
        this.langue = langue;
        this.idService = idService;
        this.idUtilisateur = idUtilisateur;
        this.arc = arc.equals("Y");
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

    public boolean isArc() {
        return this.arc;
    }
}
