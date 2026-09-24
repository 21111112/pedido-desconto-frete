package com.rodrigosiqueira_pedidos.projeto_pedidos;

import com.rodrigosiqueira_pedidos.projeto_pedidos.entities.Pedido;
import com.rodrigosiqueira_pedidos.projeto_pedidos.services.PedidoService;
import com.rodrigosiqueira_pedidos.projeto_pedidos.services.FreteService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;	

@SpringBootApplication
public class ProjetoPedidosApplication implements CommandLineRunner {
	

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPedidosApplication.class, args);
	}


	public void run(String... args) throws Exception {
		
		Pedido pedido = new Pedido(1034,150.00,20.00);
		Pedido pedido2 = new Pedido(2282, 800.00, 10.00);
		Pedido pedido3 = new Pedido(1309, 95.90, 0.00);

		
		FreteService freteService = new FreteService();
		PedidoService pedidoService = new PedidoService(freteService);
		Double total = pedidoService.calcularTotal(pedido);
		System.out.println("Total do pedido 1034: " + total);


		Double total2 = pedidoService.calcularTotal(pedido2);
		System.out.println("Total do pedido 2282: " + total2);

		Double total3 = pedidoService.calcularTotal(pedido3);
		System.out.println("Total do pedido 1309: " + total3);

		
	}
	
	
	
}
