// Criado por Edilson do Nascimento

package br.edu.utfpr.pos;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		criaListaVeiculos(veiculos);
		mostraListaVeiculos(veiculos);				
	}
	
	private static void criaListaVeiculos(List<Veiculo> veiculos) {
		Veiculo camaro      = new Veiculo("AXU456", "Chevrolet", "ZT", 350, 8, 800);
		Veiculo corsa       = new Veiculo("TOI056", "Chevrolet", "GH", 198, 4, 110);
		Veiculo opala       = new Veiculo("LOH086", "Chevrolet", "LK", 250, 6, 410);
		Veiculo mustang     = new Veiculo("LTLW90", "Ford",      "TW", 300, 6, 466);
		Veiculo golf        = new Veiculo("VBG768", "Volkswagen","PL", 300, 6, 114);
		Veiculo alfaRomeo   = new Veiculo("UGX765", "Chevrolet", "ZT", 350, 8, 900);
		Veiculo kwid        = new Veiculo("TOI056", "Chevrolet", "GH", 198, 4, 110);
		Veiculo delRei      = new Veiculo("LOH086", "Chevrolet", "LK", 250, 6, 410);
		Veiculo monza       = new Veiculo("LTLW90", "Ford",      "TW", 300, 6, 466);
		Veiculo fusca       = new Veiculo("VBG768", "Volkswagen","PL", 300, 6, 114);
		
	    veiculos.add(camaro);
	    veiculos.add(corsa);
	    veiculos.add(opala);
	    veiculos.add(mustang);
	    veiculos.add(golf);
	    veiculos.add(alfaRomeo);
	    veiculos.add(kwid);
	    veiculos.add(delRei);
	    veiculos.add(monza);
	    veiculos.add(fusca);
	}
	
	private static void mostraListaVeiculos(List<Veiculo> veiculos) {
		for (Veiculo veiculo : veiculos) System.out.println(veiculo);
	}
	
}
