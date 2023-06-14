package com.algaworks.sealedClass.entity;

import com.algaworks.sealedClass.service.Campo;

import java.time.LocalDate;

public class Client {

    @Campo
    private final Long codigo;
    @Campo(upperCase = true)
    private final String nome;
    private final LocalDate dataNascimento;

    public Client(Long codigo, String nome, LocalDate dataNascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
