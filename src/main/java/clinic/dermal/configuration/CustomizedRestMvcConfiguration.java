package clinic.dermal.configuration;

import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

/**
 * Override different methods of RepositoryRestConfigurerAdapter to achieve
 * repository configuration if needed.
 * 
 * @author zarrro
 *
 */
@Component
public class CustomizedRestMvcConfiguration extends RepositoryRestConfigurerAdapter {

}