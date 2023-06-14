package com.algaworks.staticnestedclasses;

public class Main {

    public static void main(String[] args) {

        ServiceEmail service = new ServiceEmail();

        ServiceEmail.setStatus(ServiceEmail.Status.BLOCKED);
        ServiceEmail.Message mensagem = new ServiceEmail.Message(
                "Paulo", "Fran", "Hello"
        );

        service.send(mensagem);

    }
}
