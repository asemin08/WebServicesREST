package client;

import javax.ws.rs.client.*;
import javax.ws.rs.core.Response;

public class Clientlauncher {
    public static void main( String[] args ) {

        Client client = ClientBuilder.newClient();
        Response response = client.target("http://localhost:8080/monwebservicerest/rest/message").request()
                .accept("text/plain", "application/json", "*/*").get();

        if (response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL) {
           System.out.println("Error connecting to Twitter Streaming API: " + response.getStatus());
            return;
        }
        else{
            System.out.println(response.getStatus());
            System.out.println(response.getEntity());
        }
    }
}
