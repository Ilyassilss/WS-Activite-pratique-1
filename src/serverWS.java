import ws.banqueService;

import javax.xml.ws.Endpoint;

public class serverWS {
    public static void main(String[] args) {
         String url = "http://localhost:9999/";
        Endpoint.publish(url,new banqueService());
        System.out.println("Le serveur est déployé sur "+url);
    }
}
