package com.algaworks.crm.sorteio.application;


import com.algaworks.crm.sorteio.model.Supplier;
import com.algaworks.crm.sorteio.model.Search;
import com.algaworks.crm.sorteio.model.Drawing;
import com.algaworks.crm.sorteio.model.Client;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Client> clientes = new ArrayList<>();
        clientes.add(new Client("Supermercado pague e leve",80000));
        clientes.add(new Client("Posto Gasolina Boa",50000));
        clientes.add(new Client("javac Consultoria", 58000000));

        Client clienteSorteado = Drawing.drawing(clientes);
        System.out.printf("Cliente Sorteado: %s%n",clienteSorteado.getName());
        Client clienteNome = Search.getName(clientes,"Posto Gasolina Boa");
        System.out.printf("Cliente Sorteado: %s%n",clienteNome.getName());

        System.out.println();

        List<Supplier> fornecedores = new ArrayList<>();
        fornecedores.add(new Supplier("FornMais"));
        fornecedores.add(new Supplier("FornMenos"));
        fornecedores.add(new Supplier("Fornecedores do Sul"));
        fornecedores.add(new Supplier("Fornecedor Luxembourg"));

        Supplier fornecedor = Drawing.drawing(fornecedores);
        System.out.println(fornecedor.getSocialReason());




    }
}
