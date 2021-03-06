package fr.eni.trocencheres.dal;

import fr.eni.trocencheres.BusinessException;
import fr.eni.trocencheres.bo.Utilisateur;
/**
 * 
 * @author jeanr
 *
 */
public interface UtilisateurDAO extends DAO<Utilisateur> {

	/**
	 * Permet de savoir si un numero de téléphone existe déjà. 
	 * @return boolean : True si le numéro de téléphone est déjà dans la BDD, False sinon.
	 * @throws BusinessException 
	 *  
	**/
	public boolean isTelephoneExist(String telephone) throws BusinessException;
	public boolean isPseudoExist(String pseudo) throws BusinessException;
	public boolean isEmailExist(String email) throws BusinessException;
	public Utilisateur selectByLogin(String login)throws BusinessException;
}
