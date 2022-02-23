package com.objis.demorest;
 
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloService {
 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey repond via OBJIS : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}

	@GET
	public Response getHome() {

		String output = "Bienvenue ensup";

		return Response.status(200).entity(output).build();

	}

	@POST
	public Response postFormHello(@FormParam("prenom") String prenom,
						@FormParam("nom") String nom){

		String output = "Bonjour : " + prenom + " " + nom + " !";

		return Response.status(200).entity(output).build();
	}


}
