/**
 * 
 */
package fr.univlittoral.javaquarium.config;

import org.springframework.security.core.Authentication;

/**
 * @author antoineoffroy
 *
 */
public interface IAuthentificationFacade {

	/**
	 * Retrieve the user details in Spring Security.
	 *
	 * @return
	 */
	Authentication getAuthentication();

}

