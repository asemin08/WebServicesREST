package eu.ensup.allan.mavenapps.lanceur;

import com.fasterxml.jackson.databind.ObjectMapper;
import eu.ensup.allan.mavenapps.domaine.Employe;

import java.io.File;
import java.io.IOException;

public class DemoJsonJackson
{
    public static void main( String[] args ) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        Employe employe1 = new Employe("Semin", "Allan");

        // object vers fichier Json

        File resultFile = new File("employe.json");
        mapper.writeValue(resultFile, employe1);

        Employe employe = mapper.readValue(resultFile, Employe.class);

        System.out.println(employe.getNom() + " " + employe.getPrenom());
    }
}
