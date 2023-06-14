package com.algaworks.estoque;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        var products = new ArrayList<Product>();
        products.add(new Product("Sabão", new BigDecimal("9.9"), 1));
        products.add(new Product("Leite", new BigDecimal("3.4"), 22));
        products.add(new Product("Macarrão", new BigDecimal("9.3"), 0));
        products.add(new Product("Cerveja", new BigDecimal("5.8"), 14));
        products.add(new Product("Arroz", new BigDecimal("15.9"), 0));
        products.add(new Product("Chocolate", new BigDecimal("25.1"), 10, Product.Status.INACTIVE));

        //Com este predicate seria necessário criar um if dentro do for
        // Predicate<Produto> predicate = produto -> produto.getQuantidade() >= 1 && produto.getStatus().equals(Produto.Status.ATIVO);
//        products.removeIf(produto -> produto.getQuantidade() < 1 || produto.getStatus().equals(Produto.Status.INATIVO));
//
//        products.forEach(produto -> produto.setQuantidade(0));
//        products.forEach(produto -> System.out.println(produto));

//        products.forEach(produto -> {
//            produto.setQuantidade(0);
//            System.out.println(produto);
//        });

        //        for(Produto produto: products){
        //            System.out.println(produto);
        //        }

        // Comparator com Function pela quantidade e pelo nome
//        Function<Produto, Integer> function1 = produto -> produto.getQuantidade();
//        Function<Produto, String> function2 = produto -> produto.getNome();
//        products.sort(Comparator.comparing(function1).thenComparing(function2));
//         products.forEach(produto -> System.out.println(produto));

//        ToIntFunction<Produto> function1 = produto -> produto.getQuantidade();
//        Consumer<Produto> consumer1 = produto -> produto.inativar();
//
//        ToIntFunction<Produto> function2 = Produto::getQuantidade;
//        Consumer<Produto> consumer2 = Produto::inativar;

//        products.forEach(Produto::inativar);

//        var inativacaoProduto = new ServicoInativacaoProduto();
//        products.sort(Comparator.comparing(Produto::getQuantidade));
//        products.forEach(inativacaoProduto::processar);

//        products.forEach(produto -> System.out.println(produto));


        FunctionalInterface minhaInterfaceFuncional = Product::new;
        products.add(minhaInterfaceFuncional.getProduct("Carne", new BigDecimal("25.0"),25, Product.Status.ACTIVE));
        products.forEach(System.out::println);

    }

}
