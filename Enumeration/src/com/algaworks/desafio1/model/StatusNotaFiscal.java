package com.algaworks.desafio1.model;

public enum StatusNotaFiscal {

    NAO_EMITIDO{
        @Override
        public boolean podeEmitir() {
            return true;
        }

        @Override
        public boolean podeCancelar(double valor) {
            return true;
        }
    },
    EMITIDO {
        @Override
        public boolean podeEmitir() {
            return false;
        }

        @Override
        public boolean podeCancelar(double valor) {
            return valor < 1000;
        }
    },
    CANCELADO {
        @Override
        public boolean podeEmitir() {
            return false;
        }

        @Override
        public boolean podeCancelar(double valor) {
            return false;
        }
    };

    public abstract boolean podeEmitir();

    public abstract boolean podeCancelar(double valor);








}
