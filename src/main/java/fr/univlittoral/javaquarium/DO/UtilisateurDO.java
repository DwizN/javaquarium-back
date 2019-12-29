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

@Table(name="P_USER") 
public class UtilisateurDO {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PU_ID")
	private Long id;
	
	@Column(name=" PU_USERNAME ", nullable=false) 
	private String username;

	@Column(name=" PU_NOM ", nullable=false) 
	private String nom;

	@Column(name="PU_PRENOM") 
	private String prenom;
	
	@Column(name="PU_AGE") 
	private Integer age;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

}
