package com.ishwor.kafle.configuration;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Created by script on 12/4/16.
 */

/*<p>
*
* The SecurityWebApplicationInitializer will do the following things:
    -Automatically register the springSecurityFilterChain Filter for every URL in your application
    -Add a ContextLoaderListener that loads the WebSecurityConfig.
* </p>*/
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
}
