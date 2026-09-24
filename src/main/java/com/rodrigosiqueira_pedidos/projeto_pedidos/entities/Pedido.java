package com.rodrigosiqueira_pedidos.projeto_pedidos.entities;

public class Pedido {

    private Integer codigo;
    private Double valor;
    private Double desconto;


    public Pedido() {
    
        this.codigo = codigo;
        this.valor = valor;
        this.desconto = desconto;
  
    }


    public Integer getCodigo() {
        return codigo;
    }


    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }


    public Double getValor() {
        return valor;
    }


    public void setValor(Double valor) {
        this.valor = valor;
    }


    public Double getDesconto() {
        return desconto;
    }


    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }


    public Pedido(Integer codigo, Double valor, Double desconto) {
        this.codigo = codigo;
        this.valor = valor;
        this.desconto = desconto;
    }



  



}
