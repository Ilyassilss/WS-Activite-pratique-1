package ws;

import metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public class banqueService {
    @WebMethod(operationName = "conversionEuroTODh")
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt * 11;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, new Date(), Math.random() * 9999);
    }


    @WebMethod
    public List<Compte> getComptes() {
        List<Compte> listComptes = new ArrayList<>();
        listComptes.add(new Compte(1, new Date(), Math.random() * 9999));
        listComptes.add(new Compte(2, new Date(), Math.random() * 9999));
        listComptes.add(new Compte(3, new Date(), Math.random() * 9999));

        return listComptes;
    }


}
