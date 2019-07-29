package gerenciamento;

import entidades.Vendedor;
import persistence.Reader;
import java.util.ArrayList;
import java.util.List;

public class VendedorGerenciamento {
    private List<Vendedor> vendedores = new ArrayList<Vendedor>();

    public void getVendedorList() {
        for (String salesman : Reader.getArcFormated()) {
            if (salesman.startsWith("001ç")) {
                String aux[] = salesman.split("ç");
                vendedores.add(new Vendedor(aux[1], aux[2], Double.parseDouble(aux[3])));
            }

        }
    }

    public int totalVendedores() {
        return vendedores.size();
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

}
