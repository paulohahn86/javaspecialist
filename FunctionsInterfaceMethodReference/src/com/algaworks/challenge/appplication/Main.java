package com.algaworks.challenge.appplication;

import com.algaworks.challenge.model.Employer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        var employers = new ArrayList<Employer>();

        employers.add(new Employer("João", new BigDecimal("19000"), Employer.Status.ACTIVE));
        employers.add(new Employer("Maria", new BigDecimal("5000"), Employer.Status.ACTIVE));
        employers.add(new Employer("Manoel", new BigDecimal("13000"), Employer.Status.ACTIVE));
        employers.add(new Employer("Sebastião", new BigDecimal("12000"), Employer.Status.INACTIVE));

        // remover funcionários inativos
        employers.removeIf(funcionario -> funcionario.getStatus().equals(Employer.Status.INACTIVE));


        // ordenar funcionários pelo valor do salário
      //  employers.sort(Comparator.comparing(funcionario -> funcionario.getSalario()));
        employers.sort(Comparator.comparing(Employer::getSalary));

        // iterar e imprimir funcionários usando o método estático imprimir

//        for (Funcionario funcionario: employers) {
//            imprimir(funcionario);
//        }
        employers.forEach(Main::print);

       // employers.forEach(System.out::println);


    }

    public static void print(Employer funcionario){
        // implementar a impressão do nome, salário e impostos (20%)
       // BigDecimal fee = new BigDecimal(String.valueOf(funcionario.getSalario().multiply(BigDecimal.valueOf(0.2))));
        BigDecimal fee = funcionario.getSalary().multiply(new BigDecimal("0.20"));
        BigDecimal newSalary = funcionario.getSalary().subtract(fee);
        System.out.printf("%s - R$ %s - R$ %s%n ", funcionario.getName(), String.format("%.2f",newSalary),String.format("%.2f",fee));
    }
}
