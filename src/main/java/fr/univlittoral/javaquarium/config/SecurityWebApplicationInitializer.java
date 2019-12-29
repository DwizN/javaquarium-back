/**
 * 
 */
package fr.univlittoral.javaquarium.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * @author antoineoffroy
 *
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

	public SecurityWebApplicationInitializer() {
		super(WebSecurityConfig.class);
	}
}

