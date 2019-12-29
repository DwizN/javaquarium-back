package fr.univlittoral.javaquarium.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * The facade exposes the Authentication object while hiding the static state
 *
 * @author mxd
 *
 */
public class AuthentificationFacade implements IAuthentificationFacade {

	@Override
	public Authentication getAuthentication() {
		return SecurityContextHolder.getContext().getAuthentication();
	}
}
