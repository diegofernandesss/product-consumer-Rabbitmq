package com.diego.demo_backend.dto;

import java.math.BigDecimal;


public class PagamentoDTO {
    private String numeroPedido;
    private BigDecimal valor;
    private String produto;

    public PagamentoDTO(String numeroPedido, BigDecimal valor, String produto) {
        this.numeroPedido = numeroPedido;
        this.valor = valor;
        this.produto = produto;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

}
