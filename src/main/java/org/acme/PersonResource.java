package org.acme;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.Set;

@Path("/consume")
public class PersonResource {

    @Inject
    @RestClient
    PersonService personService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/retrieve/{name}")
    public Person getPerson(@PathParam String name) {
        return personService.getByName(name);
    }

    @POST
    @Path("/create/person")
    public Response createPerson(Person person){
        return personService.createPerson(person);
    }
}