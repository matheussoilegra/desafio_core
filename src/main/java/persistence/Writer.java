package persistence;

import gerenciamento.ClienteGerenciamento;
import gerenciamento.VendasGerenciamento;
import gerenciamento.VendedorGerenciamento;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private ClienteGerenciamento clienteGerenciamento = new ClienteGerenciamento();
    private VendasGerenciamento vendasGerenciamento = new VendasGerenciamento();
    private VendedorGerenciamento vendedorGerenciamento = new VendedorGerenciamento();

    public Writer() {
        this.clienteGerenciamento.getClienteList();
        this.vendasGerenciamento.getVendasList();
        this.vendedorGerenciamento.getVendedorList();
    }

    public void criarRelatorio() {
        try {
//            FileWriter arquivo = new FileWriter(new File("C:\\Users\\mathe\\Desktop\\desafiocorefiles\\data\\out\\file2.done.dat"));
            FileWriter arquivo = new FileWriter(new File("/home/ilegra0369/Downloads/desafiocorefiles/data/out/file2.done.dat"));
            arquivo.write("Quantidade de clientes: " + clienteGerenciamento.totalClientes() + "\r\n"
                    + "Quantidade de vendedores: " + vendedorGerenciamento.totalVendedores() + "\r\n"
                    + "Id da venda mais cara: " + vendasGerenciamento.getIdVendaCara() + "\r\n"
                    + "Pior Vendedor: " + vendasGerenciamento.getPiorVenda());
            arquivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
