package com.algaworks.challenge.application;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws ParseException {
        //Locale.setDefault(new Locale("pt","BR"));
        Scanner scanner = new Scanner(System.in);


        System.out.printf("Product Price in US Dollars: ");
        String price = scanner.next();

        System.out.printf("Price of 1 Dollar in Real: ");
        String realExchange = scanner.next();

        DecimalFormat decimalFormatUS = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(Locale.US));
        decimalFormatUS.setParseBigDecimal(true);

        DecimalFormat decimalFormatBr = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt","BR")));
        decimalFormatBr.setParseBigDecimal(true);

        NumberFormat numberFormat = new DecimalFormat("¤ #,##0.00", new DecimalFormatSymbols(new Locale("pt","BR")));

        BigDecimal bigPrice = (BigDecimal) decimalFormatUS.parse(price);
        BigDecimal bigExchangeReal = (BigDecimal) decimalFormatBr.parse(realExchange);

        BigDecimal total = bigPrice.multiply(bigExchangeReal);

        System.out.println(numberFormat.format(total));

    }
}
