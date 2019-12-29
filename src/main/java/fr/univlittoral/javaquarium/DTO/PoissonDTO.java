/**
 * 
 */
package fr.univlittoral.javaquarium.DTO;

/**
 * @author antoineoffroy
 *
 */
public class PoissonDTO {

	private String nom;
	private String description;
	private String couleur;
	private Double longueur;
	private Double largeur;
	private Double prix;
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}
	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	/**
	 * @return the longueur
	 */
	public Double getLongueur() {
		return longueur;
	}
	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(Double longueur) {
		this.longueur = longueur;
	}
	/**
	 * @return the largeur
	 */
	public Double getLargeur() {
		return largeur;
	}
	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(Double largeur) {
		this.largeur = largeur;
	}
	/**
	 * @return the prix
	 */
	public Double getPrix() {
		return prix;
	}
	/**
	 * @param prix the prix to set
	 */
	public void setPrix(Double prix) {
		this.prix = prix;
	}
}
