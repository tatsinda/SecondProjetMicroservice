
/*package org.sid;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

//telecharger cette librarie
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

public class GlobalRepositoryRestConfigurer extends RepositoryRestConfigurerApdater{

	@Override
	public void configureRepositoryRestconfiguration(RepositoryRestConfiguration repositoryRestConfiguration) {
		
		
		repositoryRestConfiguration.setReturnBodyOnCreate(true);
		repositoryRestConfiguration.setReturnBodyOnUpdate(true);
		repositoryRestConfiguration.exposeIdsFor(Etudiant.class,Formation.class);
		repositoryRestConfiguration.getCorsRegistry()
		.addMapping("/**") //on accepte n'importe quelle url
		.allowedOrigins("*")//venant de n'importe quel omaine qui veut acceder au Ms
		.allowedHeaders("*")//on accepte n'importe quelle entete
		.allowedMethods("OPTIONS,HEAD","GET","PUT","POST","DELETE","PATCH"); //liste de methode accepter 
		
		
	}
}*/
