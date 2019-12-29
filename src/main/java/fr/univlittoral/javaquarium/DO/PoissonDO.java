/**
 * 
 */
package fr.univlittoral.javaquarium.DO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author antoineoffroy
 *
 */
@Entity 

@Table(name="P_POISSONS") public class PoissonDO {
	
@Id 
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="P_ID")
private Integer id;

@Column(name=" P_ESPECE ", nullable=false) 
private String espece;

@Column(name="P_DESC1") 
private String description1;

@Column(name="P_DESC2") 
private String description2;

@Column(name="P_DESC3") 
private String description3;

@Column(name="P_COULEUR") 
private String couleur;

@Column(name="P_LONGUEUR") 
private Double longueur;

@Column(name="P_LARGEUR") 
private Double largeur;

@Column(name="P_PRIX")
private Double prix;

/**
 * @return the id
 */
public Integer getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(Integer id) {
	this.id = id;
}

/**
 * @return the espece
 */
public String getEspece() {
	return espece;
}

/**
 * @param espece the espece to set
 */
public void setEspece(String espece) {
	this.espece = espece;
}

/**
 * @return the description1
 */
public String getDescription1() {
	return description1;
}

/**
 * @param description1 the description1 to set
 */
public void setDescription1(String description1) {
	this.description1 = description1;
}

/**
 * @return the description2
 */
public String getDescription2() {
	return description2;
}

/**
 * @param description2 the description2 to set
 */
public void setDescription2(String description2) {
	this.description2 = description2;
}

/**
 * @return the description3
 */
public String getDescription3() {
	return description3;
}

/**
 * @param description3 the description3 to set
 */
public void setDescription3(String description3) {
	this.description3 = description3;
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




