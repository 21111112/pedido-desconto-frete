package com.rodrigosiqueira_pedidos.projeto_pedidos.services;

import org.springframework.stereotype.Service;

@Service
public class FreteService {

    public Double calcularFrete(Double valor) {

        if (valor < 100.00) {
            return 20.00;
        }

        if (valor >= 100.00 && valor <= 200.00){
            return 12.00;
        }

        if (valor > 200.00) {
            return 0.00;
        }

        return valor;
    }    
}