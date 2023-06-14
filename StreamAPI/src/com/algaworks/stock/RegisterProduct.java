package com.algaworks.stock;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class RegisterProduct {

    private final List<Product> products;

    public RegisterProduct(){

        Category categoriaChurrasco = new Category("Churrasco");
        Category categoriaCarnes = new Category("Carnes");
        Category categoriaBebidas = new Category("Bebidas");
        Category categoriaOutros = new Category("Outros");

        Manufacturer fabricanteDiPrima = new Manufacturer("Di Prima");
        Manufacturer fabricanteCocaCola = new Manufacturer("Coca-cola");
        Manufacturer fabricanteCorona = new Manufacturer("Corona");
        Manufacturer fabricanteCisne = new Manufacturer("Cisne");

        this.products = Arrays.asList(
                new Product("Picanha", new BigDecimal("100"), 0,
                        fabricanteDiPrima, Product.Status.INACTIVATE, categoriaCarnes, categoriaChurrasco),
                new Product("Cupim", new BigDecimal("80"), 10,
                        fabricanteDiPrima, Product.Status.INACTIVATE, categoriaCarnes, categoriaChurrasco),
                new Product("Suco", new BigDecimal("23"), 20,
                        fabricanteCocaCola, Product.Status.INACTIVATE, categoriaBebidas),
                new Product("Cerveja", new BigDecimal("14"), 110,
                        fabricanteCorona, Product.Status.INACTIVATE, categoriaBebidas, categoriaChurrasco),
                new Product("Refri", new BigDecimal("20"), 15,
                        fabricanteCocaCola, Product.Status.INACTIVATE, categoriaBebidas),
                new Product("Sal", new BigDecimal("5"), 0,
                        fabricanteCisne, Product.Status.INACTIVATE, categoriaOutros, categoriaChurrasco),
                new Product("Café", new BigDecimal("5"), 0,
                        fabricanteCisne, Product.Status.INACTIVATE, categoriaOutros)
        );


    }

    public List<Product> getAll(){
        return products;
    }


}
