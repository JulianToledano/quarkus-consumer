package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Set;

@Path("/dbc")
@RegisterRestClient
public interface PersonService{

    @GET
    @Path("/retrieve/{name}")
    @Produces("application/json")
    Person getByName(@PathParam String name);
}
