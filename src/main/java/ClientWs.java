import proxy.Banque;
import proxy.BanqueService;
import proxy.Compte;

public class ClientWs {

    public static void main(String[] args) {
        BanqueService stub =new Banque().getBanqueServicePort();
        System.out.println(stub.convert(7600));
        Compte cp = stub.getCompte(5);
        System.out.println("code : "+cp.getCode());
        System.out.println("solde: "+ cp.getSolde());

    }
}
