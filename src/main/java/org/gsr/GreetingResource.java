package org.gsr;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    // mvn quarkus:list-extensions : to see the list of extensions
    // quarkus-smallrye-openapi : swagger api
    // mvn quarkus:add-extension -Dextensions="quarkus-smallrye-openapi" //adding the swagger dependency into exisiting project
    
}
