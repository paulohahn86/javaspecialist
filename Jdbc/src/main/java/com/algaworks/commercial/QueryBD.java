package com.algaworks.commercial;

import java.math.BigDecimal;
import java.sql.*;

public class QueryBD {

    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/specialistjava", "root", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from venda")){

            while (resultSet.next()){
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name_cliente");
                BigDecimal total_value = resultSet.getBigDecimal("total_value");
                Date date_payment = resultSet.getDate("date_payment");
                System.out.printf("%d - %s - R$%.2f - %s%n",id,name,total_value,date_payment);

            }

        } catch (SQLException e) {
            System.out.println("Error connection BD");
            e.printStackTrace();
        }

    }
}
