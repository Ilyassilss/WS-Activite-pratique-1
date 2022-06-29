import proxy.BanqueService;
import proxy.BanqueServiceService;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueServiceService().getBanqueServicePort();
        System.out.println(stub.conversionEuroTODh(9));

        Compte cp = stub.getCompte(1);

        List<Compte> cps = stub.getComptes();

        cps.forEach(compte -> {
            System.out.println("-----------------");
            System.out.println(compte.getCode());
            System.out.println(compte.getSolde());
        });


    }
}
