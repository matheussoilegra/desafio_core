package gerenciamento;

import entidades.Cliente;
import persistence.Reader;
import java.util.ArrayList;
import java.util.List;

public class ClienteGerenciamento {
    private List<Cliente> clientes = new ArrayList<Cliente>();

    public void getClienteList() {
        for (String customer : Reader.getArcFormated()) {
            if (customer.startsWith("002ç")) {
                String aux[] = customer.split("ç");
                clientes.add(new Cliente(aux[1], aux[2], aux[3]));
            }
        }
    }

    public int totalClientes() {
        return clientes.size();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
