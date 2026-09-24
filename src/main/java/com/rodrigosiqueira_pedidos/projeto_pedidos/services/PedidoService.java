package com.rodrigosiqueira_pedidos.projeto_pedidos.services;
import org.springframework.stereotype.Service;

import com.rodrigosiqueira_pedidos.projeto_pedidos.entities.Pedido;

@Service 
public class PedidoService {

    private final FreteService freteService;

    public PedidoService(FreteService freteService) {
        this.freteService = freteService;
    }

    public Double calcularTotal(Pedido pedido) {

        Double valorDesconto =
                pedido.getValor() * pedido.getDesconto() / 100.0;

        Double valorComDesconto =
                pedido.getValor() - valorDesconto;

        Double frete =
                freteService.calcularFrete(pedido.getValor());

        return valorComDesconto + frete;
    }
}
