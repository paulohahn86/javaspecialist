package com.algaworks.commercial;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Register {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String dml = """
                insert into venda (
                name_cliente,
                total_value,
                 date_payment) values (?,?,?)
                """;

        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/specialistjava","root","");
             PreparedStatement preparedStatement = connection.prepareStatement(dml, Statement.RETURN_GENERATED_KEYS)
        ){

            connection.setAutoCommit(false);

            try {
                do {

                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Total value: ");
                    BigDecimal total_value = new BigDecimal(scanner.nextLine());

                    System.out.print("Date of payment: ");
                    LocalDate localDate = LocalDate.parse(scanner.nextLine(),
                            DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    preparedStatement.setString(1, name);
                    preparedStatement.setBigDecimal(2, total_value);
                    preparedStatement.setDate(3, Date.valueOf(localDate));
                    preparedStatement.executeUpdate();

                    ResultSet idResultSet = preparedStatement.getGeneratedKeys();
                    idResultSet.next();
                    Long id = idResultSet.getLong(1);

                    System.out.println("Venda cadastrada com código " + id + "!");

                    System.out.print("Continuar? ");
                } while ("sim".equalsIgnoreCase(scanner.nextLine()));

                connection.commit();
            }catch (Exception e){
                connection.rollback();
                throw new RuntimeException(e);
            }

        } catch (Exception e) {
            System.out.println("Error BD");
            e.printStackTrace();
        }

    }
}
