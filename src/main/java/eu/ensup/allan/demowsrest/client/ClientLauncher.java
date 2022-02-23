package eu.ensup.allan.demowsrest.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import eu.ensup.allan.demowsrest.domaine.Track;

public class ClientLauncher {
    public static void main( String[] args ) {
        // Create Client
        Client client = Client.create();

        WebResource webResource = client.resource("http://localhost:8080/restfulexample/rest/json/metallica/get");

        ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

        // Status 200 is successful.
        if (response.getStatus() != 200) {
            String error= response.getEntity(String.class);
            System.out.println("Error: "+error);
            return;
        }

        String output = response.getEntity(String.class);
        System.out.println(output);
    }
}
