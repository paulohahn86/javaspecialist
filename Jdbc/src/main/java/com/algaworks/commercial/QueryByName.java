package com.algaworks.commercial;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Scanner;

public class QueryByName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Search by name: ");
        String search = scanner.nextLine();

        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/specialistjava",
                        "root","");
             Statement statement = connection.createStatement();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "select * from venda where name_cliente like ?")){

            preparedStatement.setString(1,"%" + search + "%");
            ResultSet resultSet  = preparedStatement.executeQuery();

            while(resultSet.next()){
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name_cliente");
                BigDecimal total_value = resultSet.getBigDecimal("total_value");
                Date date_payment = resultSet.getDate("date_payment");
                System.out.printf("%d - %s - R$ %.2f - %s%n",id,name,total_value, date_payment);
            }
        } catch (SQLException e) {
            System.out.println("Error connection BD.");
            e.printStackTrace();
        }


    }

}
