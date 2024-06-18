import java.util.ArrayList;
import java.util.List;

import entities.Contato;
import entities.OperacoesContato;

public class App {
    public static void main(String[] args) throws Exception {

        OperacoesContato oc = new OperacoesContato();

        String name = "Marcos";
        String telefone = "9922929229";
        String email = "marcos@hotmail.com";

        Contato contato = new Contato(name, telefone, email);
        oc.listAdicionar(contato);

        System.out.println(oc);
    }
}
