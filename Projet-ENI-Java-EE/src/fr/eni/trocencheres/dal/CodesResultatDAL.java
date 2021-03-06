package fr.eni.trocencheres.dal;

/**
 * @author Jean Les codes disponibles sont entre 10000 et 19999
 */
public abstract class CodesResultatDAL {

	/**
	 * Echec général quand tentative d'ajouter un objet null
	 */
	public static final int INSERT_OBJET_NULL = 10000;

	/**
	 * Echec général quand erreur non gérée à l'insertion
	 */
	public static final int INSERT_OBJET_ECHEC = 10001;

	/**
	 * Echec général quand tentative de supprimer un objet null
	 */
	public static final int DELETE_OBJET_NULL = 10002;

	/**
	 * Erreur à la suppression d'un article
	 */
	public static final int SUPPRESSION_UTILISATEUR_ERREUR = 10003;

	/**
	 * Echec de la lecture Utilisateurs
	 */
	public static final int LECTURE_UTILISATEURS_ECHEC = 10004;

	/**
	 * Echec général quand tentative update un objet null
	 */
	public static final int UPDATE_OBJET_NULL = 10005;

	/**
	 * Echec général quand erreur non gérée lors de la mise à jour d'un objet
	 */
	public static final int UPDATE_OBJET_ECHEC = 10006;

	/**
	 * Echec de la lecture d'un utilisateurs
	 */
	public static final int LECTURE_UTILISATEUR_ECHEC = 10007;

	/**
	 * Echec dans la recherche d'un numéro de téléphone
	 */
	public static final int ECHEC_LECTURE_TELEPHONE = 10008;

	/**
	 * Echec dans la recherche par Login
	 */
	public static final int ECHEC_LECTURE_BY_LOGIN = 10009;

	/**
	 * Echec de la lecture categories
	 */
	public static final int LECTURE_CATEGORIES_ECHEC = 10011;

	/**
	 * Echec de la lecture d'une categorie
	 */
	public static final int LECTURE_CATEGORIE_ECHEC = 10012;

	/**
	 * Echec lors de la suppresion d'une categorie
	 */
	public static final int SUPPRESSION_CATEGORIE_ECHEC = 10013;

	/**
	 * Echec de la lecture d'une enchere
	 */
	public static final int LECTURE_ENCHERE_ECHEC = 10014;

	/**
	 * Echec lors de la suppresion d'une categorie
	 */
	public static final int SUPPRESSION_ENCHERE_ECHEC = 10015;

	/**
	 * Echec de la lecture des ventes
	 */
	public static final int LECTURE_VENTES_ECHEC = 10016;

	/**
	 * Echec de la lecture d'une vente
	 */
	public static final int LECTURE_VENTE_ECHEC = 10017;

	/**
	 * Echec lors de la suppression d'une enchère
	 */
	public static final int ROLLBACK_ENCHERE_ECHEC = 10018;

	/**
	 * Echec dans la recherche d'un numéro de téléphone
	 */
	public static final int ECHEC_LECTURE_PSEUDO = 10019;

	/**
	 * Echec dans la recherche d'un email
	 */
	public static final int ECHEC_LECTURE_EMAIL = 10020;

}
