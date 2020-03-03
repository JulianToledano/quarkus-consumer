package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import io.quarkus.arc.config.ConfigProperties;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import java.util.Set;

@Path("/dbc")
@RegisterRestClient
public interface PersonService{

    @GET
    @Path("/retrieve/{name}")
    @Produces("application/json")
    Person getByName(@PathParam String name);

    @POST
    @Path("/create/person")
    Response createPerson(Person person);
}
