package com.algaworks.stock;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        var registerProduct = new RegisterProduct();
        List<Product> products = registerProduct.getAll();
        // List<Produto> products = new ArrayList<>();

        List<Manufacturer> manufacturers = products.stream()
                .filter(Product::hasStock)
                .map(Product::getManufacturer)
                .distinct()
                .toList();
        System.out.println(manufacturers);


//        Random random = new Random();
//        Stream.generate(() -> random.nextInt(9) + 1)
//                .distinct()
//                .limit(5)
//                .forEach(System.out::println);

//        Stream.iterate(new BigDecimal("100"),
//                valor -> valor.compareTo(BigDecimal.ZERO) >=0,
//                valor -> valor.subtract(new BigDecimal("10")))
//                .forEach(System.out::println);


//        Map<Boolean, List<Produto>> estoqueProdutos = products.stream()
//                .collect(Collectors.partitioningBy(Produto::temEstoque));
//
//        estoqueProdutos.forEach((chave, valor) -> {
//            System.out.println();
//            System.out.println(chave);
//            System.out.println("-----");
//            valor.forEach(System.out::println);
//        });


//        Map<String, Long> produtosPorFabricante = products.stream()
//                .filter(Produto::temEstoque)
//                .collect(Collectors.groupingBy(produto -> produto.getFabricante().name(),
//                        Collectors.counting()));
//        System.out.println(produtosPorFabricante);

//        Map<String, Integer> produtosPorFabricante = products.stream()
//                .filter(Produto::temEstoque)
//                .collect(Collectors.groupingBy(produto -> produto.getFabricante().name(),
//                        Collectors.summingInt(Produto::getQuantidade)));
//        System.out.println(produtosPorFabricante);


//        Map<Fabricante, List<Produto>> produtosPorFabricante = products.stream()
//                .filter(Produto::temEstoque)
//                .collect(Collectors.groupingBy(Produto::getFabricante));
//
//        produtosPorFabricante.forEach((fabricante, produtosDoFabricante) -> {
//            System.out.println();
//            System.out.println(fabricante);
//            System.out.println("----------");
//            produtosDoFabricante.forEach(produto -> System.out.println(produto.getNome()));
//        });

//        Map<String, Integer> estoque = products.stream()
//                .filter(Produto::temEstoque)
//                .collect(Collectors.toMap(Produto::getNome,Produto::getQuantidade));
//        System.out.println(estoque);

//        List<Categoria> categorias = products.stream()
//                .filter(Produto::temEstoque)
//                .flatMap(produto -> produto.getCategorias().stream())
//                .distinct()
//                //.toList() Unmodifiable
//                .collect(Collectors.toList()); // modifiable
//        categorias.remove(0);
//        categorias.forEach(System.out::print);


//        Produto produto = products.stream()
//                .filter(Produto::temEstoque)
//                .min(Comparator.comparing(Produto::getPreco))
//                .orElseThrow(RuntimeException::new);
//        System.out.println(produto);


//        double media = products.stream()
//                .mapToInt(Produto::getQuantidade)
//                .average()
//                .orElseThrow(RuntimeException::new);
//        System.out.println(String.format("R$ %.2f",media));

//        long totalProdutosComEstoque = products.stream()
//                .filter(Produto::temEstoque)
//                .count();
//        System.out.println(totalProdutosComEstoque);

//            int menorQuantidadeEstoque = products.stream()
//                    .filter(Produto::temEstoque)
//                    .mapToInt(Produto::getQuantidade)
//                    .min()
//                    .orElseThrow(RuntimeException::new);
//            System.out.println(menorQuantidadeEstoque);
//
//            int maiorQuantidadeEstoque = products.stream()
//                    .mapToInt(Produto::getQuantidade)
//                    .max()
//                    .orElseThrow(RuntimeException::new);
//        System.out.println(maiorQuantidadeEstoque);

//        int soma = products.stream().mapToInt(Produto::getQuantidade)
//                .sum(); /// somente com valores primitivos para objetos deve-se usar o reduce
//        System.out.println(soma);

//        int totalEstoque = products.stream()
//                .mapToInt(Produto::getQuantidade)
//                .reduce(Integer::max)
//                .orElseThrow(RuntimeException::new);
//        System.out.println(totalEstoque);

//        BigDecimal valorEmEstoque = products.stream()
//                .map(Produto::getValorEstoque)
//                .reduce(BigDecimal.ZERO,BigDecimal::add);
//        System.out.println(String.format("R$ %.2f", valorEmEstoque));


//        int value = products.stream().mapToInt(Produto::getQuantidade)
//                .reduce(0, Integer::sum);
//        System.out.println(value);


//        products.stream()
//                .filter(Produto::temEstoque)
//                .mapToInt(Produto::getQuantidade)
//                .forEach(System.out::println);


//        products.stream()
//                .filter(Produto::temEstoque)
//                .flatMap(produto -> produto.getCategorias().stream())// com flapMap retorna diretamente um Stream<Categoria> achata os Streams
//                .distinct()
//              //.map(Produto::getNome)
//             // .map(Produto::getFabricante)// retorna um Stream<Fabricante>
//            //    .map(Produto::getCategorias) // com Map retorna Stream<Stream<Categoria>>
//           //   .distinct()// elimina os elementos duplicados
//                .forEach(System.out::println);


//        products.stream()
//                .filter(Produto::temEstoque)
//                .sorted(Comparator.comparing(Produto::getNome).thenComparingInt(Produto::getQuantidade))
//                .forEach(produto -> System.out.printf("%s = %d unidades%n",
//                        produto.getNome(), produto.getQuantidade()));

//        boolean temProdutoEstoque = products.stream()
//                .peek(System.out::println)
//                .anyMatch(Produto::temEstoque);

//        boolean todosProdutosPossuemEstoque = products.stream()
//                .peek(System.out::println)
//                .allMatch(Produto::temEstoque);

//        boolean nenhumProdutosPossuiEstoque = products.stream()
//                .peek(System.out::println)
//                .noneMatch(Produto::temEstoque);
//
//        System.out.println(nenhumProdutosPossuiEstoque);


//        Optional<Produto> fisrtProduto = products.stream()
//                .peek(System.out::println)
//                .filter(Produto::temEstoque)
//                .filter(Produto::isInativo)
//                .findFirst(); // operação terminal e retorna um Optional
//
//
//        Produto produto = fisrtProduto.orElseThrow(() -> new RuntimeException("Produto não encontrado"));
//
//        System.out.println(produto);

//        products.stream()
//                .peek(produto -> produto.setNome(produto.getNome().toUpperCase())) // transforma o estado dos elementos
//       //         .filter(produto -> produto.temEstoque() && produto.isInativo())
//                .filter(Produto::temEstoque)
//                .filter(Produto::isInativo)
//                .forEach(produto -> {
//                    produto.ativar();
//                    System.out.println(produto);
//                });

//        Stream<Produto> stream = products.stream();
//        Stream<Produto> streamComEstoque = stream.filter(Produto::temEstoque);
//        Stream<Produto> streamComEstoqueInativo = streamComEstoque.filter(Produto::isInativo);
//
//        streamComEstoqueInativo.forEach(produto -> {
//            produto.ativar();
//            System.out.println(produto);
//        });

    }
}
